import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserInputsCheckTest {

    UserInputsCheck checker = new UserInputsCheck();
    String validEmail = "valid@email.com";
    String validPassword = "ThisPasswordIsValid";

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"email_without_at_symbol.com", "notContains@anyDotCom"})
    void incorrectEMailsShouldThrowIllegalArgumentException(String invalidEmail) {

        assertThrows(IllegalArgumentException.class, () -> {
            checker.checkInputs(invalidEmail, validPassword);
        });
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"Short!", "nocapitalletters@#%&"})
    void incorrectPasswordShouldThrowIllegalArgumentException(String invalidPassword) {

        assertThrows(IllegalArgumentException.class, () -> {
            checker.checkInputs(validEmail, invalidPassword);
        });
    }

    @Test
    void correctEmailAndPasswordShouldNotThrowAnException() {
        assertDoesNotThrow(() -> checker.checkInputs(validEmail, validPassword));
    }
}
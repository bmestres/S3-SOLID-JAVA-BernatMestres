import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class StandardUserValidatorTest {

    UserValidator validator = new StandardUserValidator();

    String validName = "TestUser";
    String validEmail = "valid@email.com";
    String validPassword = "ThisPasswordIsValid";

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"email_without_at_symbol.com", "notContains@anyDotCom"})
    void incorrectEMailsShouldThrowIllegalArgumentException(String invalidEmail) {

        User testUser = new User(validName, invalidEmail, validPassword);
        assertThrows(IllegalArgumentException.class, () -> validator.validate(testUser));
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"Short!", "nocapitalletters@#%&"})
    void incorrectPasswordShouldThrowIllegalArgumentException(String invalidPassword) {

        User testUser = new User(validName, validEmail, invalidPassword);
        assertThrows(IllegalArgumentException.class, () -> validator.validate(testUser));
    }

    @Test
    void correctEmailAndPasswordShouldNotThrowAnException() {
        User testUser = new User(validName, validEmail, validPassword);
        assertDoesNotThrow(() -> validator.validate(testUser));
    }
}
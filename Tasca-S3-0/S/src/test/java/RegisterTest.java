import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RegisterTest {

    @Mock
    UserInputsCheck checker;

    @Mock
    EMailService service;

    @InjectMocks
    Register register;

    @Test
    void correctEmailAndPasswordShouldCallService() {
        String name = "Alf";
        String validEmail = "valid@email.com";
        String validPassword = "ThisPasswordIsValid";
        User user = new User(name, validEmail, validPassword);

        register.registerUser(user);

        verify(checker, times(1)).checkInputs(validEmail, validPassword);
        verify(service, times(1)).sendConfirmation(validEmail);
    }
}
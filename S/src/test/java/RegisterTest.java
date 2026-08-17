import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RegisterTest {

    @Mock
    UserValidator validator;

    @Mock
    NotificationService service;

    Register register;

    @BeforeEach
    void setUp(){
        register = new Register(validator, service);
    }

    @Test
    void correctEmailAndPasswordShouldCallService() {
        String name = "Alf";
        String validEmail = "valid@email.com";
        String validPassword = "ThisPasswordIsValid";

        User testUser = new User(name, validEmail, validPassword);

        register.registerUser(testUser);

        verify(validator, times(1)).validate(testUser);
        verify(service, times(1)).sendConfirmation(validEmail);
    }
}
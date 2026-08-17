public class EMailService implements NotificationService {
    @Override
    public void sendConfirmation(String email){
            System.out.printf("📧 Sending confirmation email to: %s\n", email);
    }
}

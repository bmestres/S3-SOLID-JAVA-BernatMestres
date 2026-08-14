public class Register {
    private final UserInputsCheck inputsChecker;
    private final NotificationService notificationService;

    public Register(UserInputsCheck inputsChecker, EMailService emailService) {
        this.inputsChecker = inputsChecker;
        this.notificationService = emailService;
    }

    public void registerUser(User potentialUser) {
        try {
            this.inputsChecker.checkInputs(potentialUser.getEmail(), potentialUser.getPassword());
            this.notificationService.sendConfirmation(potentialUser.getEmail());

            boolean userConfirmed = true;
            if (!userConfirmed) {
                System.out.println("⚠️ User did not confirm registration.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

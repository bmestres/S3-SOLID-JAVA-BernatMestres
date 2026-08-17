public class Register {
    private final UserValidator userValidator;
    private final NotificationService notificationService;

    public Register(UserValidator userValidator, NotificationService notificationService) {
        this.userValidator = userValidator;
        this.notificationService = notificationService;
    }

    public void registerUser(User potentialUser) {
        try {
            this.userValidator.validate(potentialUser);
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

public class Register {
    UserInputsCheck inputsChecker;
    EMailService emailService;

    public Register(UserInputsCheck inputsChecker, EMailService emailService) {
        this.inputsChecker = inputsChecker;
        this.emailService = emailService;
    }

    public void registerUser(User potentialUser) {
        try {
            this.inputsChecker.checkInputs(potentialUser.getEmail(), potentialUser.getPassword());
            this.emailService.sendConfirmation(potentialUser.getEmail());

            boolean userConfirmed = true;
            if (!userConfirmed) {
                System.out.println("⚠️ User did not confirm registration.");
                return;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

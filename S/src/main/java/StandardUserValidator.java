public class StandardUserValidator implements UserValidator {

    public void validate(User user){
        checkEmail(user.getEmail());
        checkPassword(user.getPassword());
    }

    private void checkEmail(String email){
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email address.");
        }
    }

    private void checkPassword(String password){
        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long and contain an uppercase letter.");
        }
    }
}

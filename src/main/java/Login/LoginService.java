package Login;

public class LoginService {
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }
}

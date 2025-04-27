package Login;

public class LoginController {
    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    public String performLogin(String username, String password) {
        if (loginService.login(username, password)) {
            return "Login successful!";
        } else {
            return "Login failed!";
        }
    }
}

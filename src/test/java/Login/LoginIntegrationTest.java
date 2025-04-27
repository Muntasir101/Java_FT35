package Login;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoginIntegrationTest {

    @Test
    public void testSuccessfulLoginIntegration() {
        LoginService service = new LoginService();
        LoginController controller = new LoginController(service);

        String result = controller.performLogin("admin", "password123");
        assertEquals("Login successful!", result);
    }

    @Test
    public void testFailedLoginIntegration() {
        LoginService service = new LoginService();
        LoginController controller = new LoginController(service);

        String result = controller.performLogin("admin", "wrongpass");
        assertEquals("Login failed!", result);
    }
}

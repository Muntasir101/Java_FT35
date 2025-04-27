package Login;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginServiceTest {

    @Test
    public void testSuccessfulLogin() {
        LoginService service = new LoginService();
        assertTrue(service.login("admin", "password123"));
    }

    @Test
    public void testLoginWithWrongUsername() {
        LoginService service = new LoginService();
        assertFalse(service.login("wrongUser", "password123"));
    }

    @Test
    public void testLoginWithWrongPassword() {
        LoginService service = new LoginService();
        assertFalse(service.login("admin", "wrongPass"));
    }

    @Test
    public void testLoginWithNullUsername() {
        LoginService service = new LoginService();
        assertFalse(service.login(null, "password123"));
    }

    @Test
    public void testLoginWithNullPassword() {
        LoginService service = new LoginService();
        assertFalse(service.login("admin", null));
    }

    @Test
    public void testLoginWithBothNull() {
        LoginService service = new LoginService();
        assertFalse(service.login(null, null));
    }
}

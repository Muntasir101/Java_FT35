package Login;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class LoginUIIntegrationTest {

    @Test
    public void testSuccessfulLoginUI() throws Exception {
        LoginService service = new LoginService();
        LoginUI ui = new LoginUI(service);

        // Simulate user typing
        ui.getUsernameField().setText("admin");
        ui.getPasswordField().setText("password123");

        // Simulate button click
        SwingUtilities.invokeLater(() -> ui.getLoginButton().doClick());

        // Give some time for UI event
        Thread.sleep(500);

        // Check result
        assertEquals("Login successful!", ui.getResultLabel().getText());
    }

    @Test
    public void testFailedLoginUIWrongUserName() throws Exception {
        LoginService service = new LoginService();
        LoginUI ui = new LoginUI(service);

        ui.getUsernameField().setText("wronguser");
        ui.getPasswordField().setText("password123");

        SwingUtilities.invokeLater(() -> ui.getLoginButton().doClick());

        Thread.sleep(500);

        assertEquals("Login failed!", ui.getResultLabel().getText());
    }

    public void testFailedLoginUIWrongPassword() throws Exception {
        LoginService service = new LoginService();
        LoginUI ui = new LoginUI(service);

        ui.getUsernameField().setText("admin");
        ui.getPasswordField().setText("pass");

        SwingUtilities.invokeLater(() -> ui.getLoginButton().doClick());

        Thread.sleep(500);

        assertEquals("Login failed!", ui.getResultLabel().getText());
    }
}

package Login;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI {
    private LoginService loginService;
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel resultLabel;

    public LoginUI(LoginService service) {
        this.loginService = service;
        createUI();
    }

    private void createUI() {
        frame = new JFrame("Login");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 20, 80, 25);
        frame.add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(100, 20, 165, 25);
        frame.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        frame.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);
        frame.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        frame.add(loginButton);

        resultLabel = new JLabel("");
        resultLabel.setBounds(10, 110, 250, 25);
        frame.add(resultLabel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (loginService.login(username, password)) {
                    resultLabel.setText("Login successful!");
                } else {
                    resultLabel.setText("Login failed!");
                }
            }
        });

        frame.setVisible(true);
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JButton getLoginButton() {
        return (JButton) frame.getContentPane().getComponent(4);
    }

    public JLabel getResultLabel() {
        return resultLabel;
    }
}

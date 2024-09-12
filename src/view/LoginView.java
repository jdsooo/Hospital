import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    public LoginView() {
        setTitle("Rockema");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.green);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel emailLabel = new JLabel("Usuario:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(emailLabel, gbc);

        JTextField emailField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(emailField, gbc);

        JLabel passwordLabel = new JLabel("Contraseña:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(passwordField, gbc);

        JButton loginButton = new JButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(loginButton, gbc);

        loginButton.addActionListener(e -> {
            String usuario = emailField.getText();
            char[] contrasena = passwordField.getPassword();
            System.out.println("Usuario: " + usuario);
            System.out.println("Contraseña: " + new String(contrasena));
        });

        add(panel, BorderLayout.CENTER);

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginView();
    }
}

import javax.swing.*;

public class Login extends JFrame {

    public Login() {
        // Configurar la ventana
        this.setLayout(null);
        this.setBounds(0, 0, 1800, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear etiquetas y campos de texto para correo y contraseña
        JLabel emailLabel = new JLabel("Correo:");
        emailLabel.setBounds(550, 50, 100, 30);
        this.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(550, 90, 200, 30);
        this.add(emailField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(550, 130, 100, 30);
        this.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(550, 170, 200, 30);
        this.add(passwordField);

        // Hacer visible la ventana
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
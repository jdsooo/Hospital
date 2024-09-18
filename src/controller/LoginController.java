package controller;
import backEnde.BackEnde;
import model.Doctor;
import view.LoginView;
public class LoginController {
    private LoginView loginView;
    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        initController();
    }

    public void initController() {
        loginView.getLoginButton().addActionListener(e -> controllerLogin());
    }

    public void controllerLogin() {
        String email = loginView.getEmailField().getText().trim().toLowerCase(); // Normalizar el email
        String password = new String(loginView.getPasswordField().getPassword()).trim(); // Normalizar la contraseña

        BackEnde backEnde = new BackEnde();
        Doctor doctor = backEnde.validarDatos(email, password);

        if (doctor != null) {
            System.out.println("Inicio exitoso");
            System.out.println("Nombre: " + doctor.getName() + " " + doctor.getLastName());
            System.out.println("Correo: " + doctor.getEmail());
            System.out.println("Especialidad: " + doctor.getSpecialty());
            System.out.println("Usuario: " + doctor.getUser());
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }
}


package controller;

import backEnde.BackEnde;
import view.DoctorView;
import view.LoginView;
import model.Doctor;

import java.util.HashMap;

public class LoginController {
    private LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        initController();
    }

    public void initController() {
        loginView.getLoginButton().addActionListener(e -> iniciarSesion()); // Cambiado a iniciarSesion
    }

    public void iniciarSesion() { // Cambiado el nombre de la función
        String email = loginView.getEmailField().getText().trim().toLowerCase();
        String password = new String(loginView.getPasswordField().getPassword()).trim();

        BackEnde backEnde = new BackEnde();
        Doctor doctor = backEnde.validarDatos(email, password);

        if (doctor != null) {
            System.out.println("Doctor ");
            System.out.println("Nombre: " + doctor.getName() + " " + doctor.getLastName());
            System.out.println("Correo: " + doctor.getEmail());
            System.out.println("Especialidad: " + doctor.getSpecialty());

            // Crear el HashMap para pasar a DoctorView
            HashMap<String, String> doctorInfo = new HashMap<>();
            doctorInfo.put("nombre", doctor.getName() + " " + doctor.getLastName());
            doctorInfo.put("rol", doctor.getSpecialty()); // O cualquier otro dato relevante

            // Crear instancia de DoctorView
            new DoctorView(doctorInfo);
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }
}

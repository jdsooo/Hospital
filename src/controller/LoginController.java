package controller;

import backEnde.BackEnde;
import data.databasepaciente;
import view.DoctorView;
import view.LoginView;

import java.util.HashMap;

public class LoginController {
    private LoginView loginview;
    private BackEnde backEnde;
    private databasepaciente pacienteDB;

    public LoginController(LoginView loginview,BackEnde backEnde) {
        this.loginview=loginview;
        this.backEnde=backEnde;
        this.pacienteDB = new databasepaciente();
        initController();
    }

    public void initController() {
        loginview.getLoginButton().addActionListener(e -> iniciarsesion());
    }

    public void iniciarsesion() {
        String usuario = loginview.getEmailField().getText();
        String contraseña = new String(loginview.getPasswordField().getPassword());

        HashMap<String, String> resultado = backEnde.validacion(usuario, contraseña);


        if (!resultado.isEmpty()) {
            String nombreDoctor = resultado.get("nombre");
            String especialidad = resultado.get("especialidad");

            // Crear y mostrar la vista del doctor
            DoctorView doctorView = new DoctorView(nombreDoctor, especialidad, pacienteDB);
            doctorView.setVisible(true);
        }
    }
}

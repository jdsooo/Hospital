package backEnde;

import model.Doctor;
import data.DataDoctor;

public class BackEnde {
    private DataDoctor dataDoctor;

    public BackEnde() {
        dataDoctor = new DataDoctor();
    }

    public Doctor validarDatos(String email, String password) {
        Doctor doctor = dataDoctor.getDoctores().get(email);

        if (doctor != null && doctor.getPassword().equals(password)) {
            return doctor;
        }

        return null;
    }
}
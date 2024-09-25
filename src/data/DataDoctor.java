package data;
import java.util.ArrayList;
import java.util.HashMap;
import model.Doctor;

public class DataDoctor {
    private HashMap<String, Doctor> data;

    public DataDoctor() {
        data = new HashMap<>();

        data.put("daniel.ortiz@hospital.com", new Doctor("Daniel", "Ortiz", "juan.perez@hospital.com", "12", "Cardiología"));
        data.put("ana.gomez@hospital.com", new Doctor("Ana", "Gómez", "ana.gomez@hospital.com", "contraseña456", "Dermatología"));
        data.put("luis.fernandez@hospital.com", new Doctor("Luis", "Fernández", "luis.fernandez@hospital.com", "contraseña789", "Pediatría"));
        data.put("maria.rodriguez@hospital.com", new Doctor("María", "Rodríguez", "maria.rodriguez@hospital.com", "contraseña101", "Ginecología"));
        data.put("carlos.sanchez@hospital.com", new Doctor("Carlos", "Sánchez", "carlos.sanchez@hospital.com", "contraseña202", "Neurología"));
    }

    public HashMap<String, Doctor> getDoctores() {
        return data;
    }
}

package data;

import model.Doctor;
import java.util.ArrayList;
import java.util.HashMap;

public class DataDoctor {
    private HashMap<String, Doctor> data;

    public DataDoctor() {
        data = new HashMap<>();

        data.put("juan.perez@hospital.com", new Doctor("Juan", "Pérez", "juan.perez@hospital.com", "contraseña123", "Cardiología"));
        data.put("ana.gomez@hospital.com", new Doctor("Ana", "Gómez", "ana.gomez@hospital.com", "contraseña456", "Dermatología"));
        data.put("luis.fernandez@hospital.com", new Doctor("Luis", "Fernández", "luis.fernandez@hospital.com", "contraseña789", "Pediatría"));
        data.put("maria.rodriguez@hospital.com", new Doctor("María", "Rodríguez", "maria.rodriguez@hospital.com", "contraseña101", "Ginecología"));
        data.put("carlos.sanchez@hospital.com", new Doctor("Carlos", "Sánchez", "carlos.sanchez@hospital.com", "contraseña202", "Neurología"));
    }

    public HashMap<String, Doctor> getDoctores() {
        return data;
    }
}

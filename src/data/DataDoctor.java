package data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Doctor;

public class DataDoctor {

    private java.util.List<datadoc> doctors;

    public DataDoctor() {
        doctors = new ArrayList<>();
        // Agrega los doctores de ejemplo
        doctors.add(new datadoc("4", "Ana Morales", "Dermatóloga", "amorales@gmail.com", "1234"));
        doctors.add(new datadoc("5", "Luis Fernandez", "Cirujano", "lfernandez@gmail.com", "1234"));
        doctors.add(new datadoc("6", "María López", "Ginecóloga", "mlopez@gmail.com", "1234"));
        doctors.add(new datadoc("7", "Pedro Castillo", "Neurólogo", "pcastillo@gmail.com", "1234"));
        doctors.add(new datadoc("8", "Claudia Ortiz", "Psiquiatra", "cortiz@gmail.com", "1234"));
        doctors.add(new datadoc("9", "Raul Gutierrez", "Oftalmólogo", "rgutierrez@gmail.com", "1234"));
        doctors.add(new datadoc("10", "Patricia Cruz", "Reumatóloga", "pcruz@gmail.com", "1234"));
        doctors.add(new datadoc("11", "Jorge Ramirez", "Urólogo", "jramirez@gmail.com", "1234"));
        doctors.add(new datadoc("12", "Diana Mendez", "Endocrinóloga", "dmendez@gmail.com", "1234"));
        doctors.add(new datadoc("13", "Carlos Espinoza", "Gastroenterólogo", "cespinoza@gmail.com", "1234"));
        doctors.add(new datadoc("14", "Laura Vega", "Oncóloga", "lvega@gmail.com", "1234"));
        doctors.add(new datadoc("15", "Ricardo Flores", "Nefrólogo", "rflores@gmail.com", "1234"));
        doctors.add(new datadoc("16", "Gabriela Diaz", "Fisioterapeuta", "gdiaz@gmail.com", "1234"));
        doctors.add(new datadoc("17", "Sergio Martínez", "Traumatólogo", "smartinez@gmail.com", "1234"));
        doctors.add(new datadoc("18", "Isabel Hernández", "Otorrinolaringóloga", "ihernandez@gmail.com", "1234"));
        doctors.add(new datadoc("19", "Fernando Vargas", "Anestesiólogo", "fvargas@gmail.com", "1234"));
        doctors.add(new datadoc("20", "Carmen Suarez", "Médico Internista", "csuarez@gmail.com", "1234"));

    }

    public List<datadoc> getDoctors() {
        return doctors;
    }
}


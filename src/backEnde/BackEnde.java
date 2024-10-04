package backEnde;
import data.DataDoctor;
import data.datadoc;
import model.Doctor;

import java.util.HashMap;

public class BackEnde {
    private DataDoctor dataDoctor;

    public BackEnde() {
        dataDoctor = new DataDoctor();
    }

  public HashMap<String,String>validacion(String email,String contraseña) {
      HashMap<String, String> resultado = new HashMap<>();

      for (datadoc doctor : dataDoctor.getDoctors()) {
          if (doctor.getEmail().equals(email) && doctor.getPassword().equals(contraseña)) {
              resultado.put("nombre", doctor.getNombre());
              resultado.put("especialida", doctor.getEspecialidad());
          }
      }
return resultado;
  }}
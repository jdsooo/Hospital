package data;

public class datapaciente {
    private String  telefono,nombre,direccion,email,fechanacimiento,horariocita,motivodeconsulta,numerodevisita,doctor;
public  datapaciente(String direccion, String nombre, String doctor, String email, String fechanacimiento,String horariocita,String motivoconsulta,String numerodevisitas,String telefono) {
    this.nombre = nombre;
    this.email = email;
    this.direccion=direccion;
    this.doctor=doctor;
    this.telefono=telefono;
    this.fechanacimiento=fechanacimiento;
    this.horariocita=horariocita;
    this.motivodeconsulta=motivoconsulta;

}
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMotivoconsulta() {
        return motivodeconsulta;
    }

    public void setDireccion(String direccion) {
        this.direccion= direccion;
    }



    public String getDireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorariocita() {
        return horariocita;
    }

    public void setHorariocita(String horariocita) {
        this.horariocita = horariocita;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }


    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + ", Doctor: " + doctor + ", Motivo de Visita: " + motivodeconsulta +
                ", Fecha de Nacimiento: " + fechanacimiento+ ", Hora de Cita: " + horariocita +
                ", Número de Consultas: " ;
    }
}

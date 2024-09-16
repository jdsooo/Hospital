package model;

public class Doctor {
    private String name;
    private String lastName;
    private String email;
    private String specialty;
    private String user;
    private String password;

    public Doctor(String name, String lastName, String email, String password, String specialty) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.specialty = specialty;
    }


    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getSpecialty() {
        return specialty;
    }
    public String getUser() {
        return user;
    }
    public String getPassword() {
        return password;
    }
}

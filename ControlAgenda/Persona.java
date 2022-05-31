package ControlAgenda;

import java.io.Serializable;

public class Persona implements Serializable {

    String nombreP;
    String apellidoP;
    String emailP;
    String telefonoP;

    public Persona(String nombre, String apellido, String email, String telefono) {
         nombreP=nombre;
         apellidoP=apellido; 
         emailP=email; 
         telefonoP=telefono;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getEmailP() {
        return emailP;
    }

    public void setEmailP(String emailP) {
        this.emailP = emailP;
    }

    public String getTelefonoP() {
        return telefonoP;
    }

    public void setTelefonoP(String telefonoP) {
        this.telefonoP = telefonoP;
    }

}

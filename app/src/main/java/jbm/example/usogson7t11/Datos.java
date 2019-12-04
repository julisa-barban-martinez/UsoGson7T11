package jbm.example.usogson7t11;

public class Datos {
    String Nombre;
    int Edad;
    String Correo;
    String CURO;

    public Datos ( String nombre, int edad, String correo, String CURO ) {
        Nombre = nombre;
        Edad = edad;
        Correo = correo;
        this.CURO = CURO;
    }

    public String getNombre () {
        return Nombre;
    }

    public void setNombre ( String nombre ) {
        Nombre = nombre;
    }

    public int getEdad () {
        return Edad;
    }

    public void setEdad ( int edad ) {
        Edad = edad;
    }

    public String getCorreo () {
        return Correo;
    }

    public void setCorreo ( String correo ) {
        Correo = correo;
    }

    public String getCURO () {
        return CURO;
    }

    public void setCURO ( String CURO ) {
        this.CURO = CURO;
    }
    
}

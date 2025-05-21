package com.clase3ex1;

public class Persona {
    private String nombrePersona, correo, edad;

    public Persona(String nombrePersona, String correo, String edad) {
        this.nombrePersona = nombrePersona;
        this.edad = edad;
        this.correo = correo;

    }
    public String getNombrePersona(){
        return this.nombrePersona;
    }
    public String getCorreo(){
        return this.correo;
    }
    public String getEdad(){
        return this.edad;
    }
    public void logPersona(){
        System.out.println("Nombre: "+ this.nombrePersona + " Correo: "+ this.correo + " Edad: "+ this.edad.toString());
    }
}

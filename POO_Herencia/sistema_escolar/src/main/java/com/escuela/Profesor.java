package com.escuela;

class Profesor extends Persona{
    private String especialidad;

    public Profesor(String nombre, int edad, String especialidad){
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    @Override
    public String toString(){
        return "Profesor: " + super.toString() + "Especialidad: " + especialidad;
    } 
}

package com.clase3ex1;
import java.util.ArrayList;
import java.util.List;

public class GestorDePersonas {
    List<Persona> personas;

    public GestorDePersonas(){
        this.personas = new ArrayList<>();
    }

    public void addPersona(Persona persona) {
        this.personas.add(persona);
    }


}

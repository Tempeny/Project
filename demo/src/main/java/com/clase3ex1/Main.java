package com.clase3ex1;

public class Main {
    public static void main(String[] args) {
    GestorDePersonas gestorDePersonas = new GestorDePersonas();

    Persona persona1 = new Persona("Julio","julio23@example.com","23");
    gestorDePersonas.addPersona(persona1);
    Persona persona2 = new Persona("Augusto","augusto25@example.com","25");
    gestorDePersonas.addPersona(persona2);

    persona1.logPersona();
    persona2.logPersona();

    }
}
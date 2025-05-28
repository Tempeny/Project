package com.escuela;

public class Main {
    public static void main(String[] args) {
        Profesor profe = new Profesor("Laura", 40, "Historia");

        Estudiante e1 = new Estudiante("Gerard", 17, "2º Bachillerato");
        Estudiante e2 = new Estudiante("Raúl", 18, "2º Bachillerato");
        Estudiante e3 = new Estudiante("Pando", 17, "2º Bachillerato");

        Curso curso = new Curso("Revolución Industrial", profe);

        curso.agregarEstudiante(e1);
        curso.agregarEstudiante(e2);
        curso.agregarEstudiante(e3);

        curso.mostrarParticipantes();
    }
}
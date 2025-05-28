package com.escuela;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombreCurso;
    private Profesor profesor;
    private List<Estudiante> estudiantes;


    public Curso(String nombreCurso, Profesor profesor){
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e){
        estudiantes.add(e);
    }

    public void mostrarParticipantes(){
        System.out.println("Curso: " + nombreCurso);
        System.out.println(profesor.toString());
        System.out.println("Estudiantes: ");
        for (Estudiante e : estudiantes){
            System.out.println("-" + e.toString());
        }
    }
}

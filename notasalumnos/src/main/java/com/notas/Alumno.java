package com.notas;

import java.util.ArrayList;

public class Alumno {
    
    private String alumno;
    private ArrayList<Double> notas;
    private double nota;

    public Alumno(String alumno) {
        this.alumno = alumno;
        this.notas = new ArrayList<>();
    }

    public String getAlumno(){
        return this.alumno;
    }

    public void addNota(double nota){
        notas.add(nota);
    }

    public double calcularPromedio(){
        double suma = 0;
            for (double nota : notas){
             suma += nota;
            }
            return suma / notas.size();
        }
    }

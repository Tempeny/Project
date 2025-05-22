package com.example;

public class Tarea {

    private String titulo;
    private String descripcion;
    private Estado estado;
    private int idTarea;

    enum Estado{
        PENDIENTE,
        COMPLETADA
    }

    public Tarea(int idTarea, String titulo, String descripcion) {
        this.idTarea = idTarea;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = Estado.PENDIENTE;
    }

    public int getIdTarea(){
        return this.idTarea;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void completar(){
        this.estado = Estado.COMPLETADA;
    }

    public void logTarea(){
        System.out.println("Id tarea: " + this.idTarea);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("Estado: " + this.estado);
    }
}

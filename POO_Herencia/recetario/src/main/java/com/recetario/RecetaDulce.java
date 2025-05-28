package com.recetario;

class RecetaDulce extends Receta{
    public RecetaDulce(String nombre){
        super(nombre);
    }

    @Override
    public String descipcionGeneral(){
        return "Postre dulce: " + nombre + " (" + ingredientes.size() + " ingredientes)";
    }

    @Override
    public String getTipo(){
        return "Dulce";
    }
}
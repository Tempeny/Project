package com.recetario;

class RecetaSalada extends Receta{
    public RecetaSalada(String nombre){
        super(nombre);
    }

    @Override
    public String descipcionGeneral(){
        return "Postre salado: " + nombre + " (" + ingredientes.size() + " ingredientes)";
    }

    @Override
    public String getTipo(){
        return "Salada";
    }
}

package com.recetario;

import java.util.ArrayList;
import java.util.List;

abstract class Receta {
    protected String nombre;
    protected List<Ingrediente> ingredientes;
    protected List<String> pasos;

    public Receta(String nombre){
        this.nombre = nombre;
        this.ingredientes = new ArrayList<>();
        this.pasos = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ing){
        ingredientes.add(ing);
    }

    public void agregarPaso(String paso){
        pasos.add(paso);
    }

    public abstract String descipcionGeneral();

    public void mostrarDetalles(){
        System.out.println("Receta: " + nombre);
        System.out.println("Tipo: " + getTipo());
        System.out.println("Ingredientes :");
        for (Ingrediente ing: ingredientes){
            System.out.println("- " + ing);
        }
        System.out.println("Pasos de preparación :");
        for (int i = 0; i < pasos.size() ; i++){
            System.out.println((i + 1)+ ". " + pasos.get(i));
        }
    }

    public String getNombre(){
        return nombre;
    }

    public int getNumeroIngredientes(){
        return ingredientes.size();
    }

    public abstract String getTipo();


}

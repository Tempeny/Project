package com.recetario;

import java.util.ArrayList;
import java.util.List;

public class Recetario {
    private List<Receta> recetas;

    public Recetario(){
        recetas = new ArrayList<>();
    }

    public void agregarReceta(Receta receta){
        recetas.add(receta);
    }

    public void mostrarResumen(){
        if (recetas.isEmpty()){
            System.out.println("No hay recetas");
            return;
        }
        System.out.println("Resumen de recetas");
        for (int i = 0; i < recetas.size(); i++){
            Receta r = recetas.get(i);
            System.out.println((i + 1) + ". " +r.descipcionGeneral());
        }

    }

    public void mostrarDetalles(int indice) {
        if (indice < 1 || indice > recetas.size()) {
            System.out.println("Índice inválido.");
        } else {
            recetas.get(indice - 1).mostrarDetalles();
        }
    }
}


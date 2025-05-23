package com.encuestas;
import java.util.ArrayList;
import java.util.List;

public class Pregunta {
    
    String enunciado;
    List<Opcion> opciones;

    public Pregunta(String enunciado, List<String> opcionesTexto){
        this.enunciado = enunciado;
        this.opciones = new ArrayList<>();
            for (String texto: opcionesTexto ){
                this.opciones.add(new Opcion(texto));
            }
        }

    public void mostrar(){
        System.out.println(enunciado);
            for (int i = 0;i < opciones.size(); i++){
                System.out.println((i + 1) + "." + opciones.get(i).texto);
            }
    }

    public void votar(){
        
    }
    }


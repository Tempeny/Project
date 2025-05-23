package com.encuestas;

public class Opcion {
    String texto;
    int contador;
    
    public Opcion(String texto){
        this.texto = texto;
        this.contador = 0;
    }

    public void Votar(){
        contador++;
    }

}

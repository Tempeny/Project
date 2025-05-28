package com.mascotavirtual;

public class MascotaVirtual {
    
    protected String nombre;
    protected int energia;
    protected int felicidad;


    public MascotaVirtual(String nombre){
        this.nombre = nombre;
        this.energia = 50;
        this.felicidad = 50;
    }

    public void comer(){
        energia += 10;
        System.out.println(nombre + "ha comido y ha recuperado energía");
    }

    public void jugar(){
        if (energia >= 10){
            energia -= 10;
            felicidad += 10;
            System.out.println(nombre + "ha jugado y está mas feliz");
        }
        else {
            System.out.println(nombre + "está demasiado cansado para jugar");
        }
    }

    public void mostrarEstado(){
        System.out.println("Estado de " + nombre);
        System.out.println("Energía: "+ energia);
        System.out.println("Felicidad: " + felicidad);
    }

}


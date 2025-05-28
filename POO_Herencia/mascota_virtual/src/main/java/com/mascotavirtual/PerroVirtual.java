package com.mascotavirtual;


class PerroVirtual extends MascotaVirtual{

    public PerroVirtual(String nombre){
        super(nombre);
    }    

    @Override

    public void jugar(){
        if (energia >= 10){
            energia = 10;
            felicidad += 20; //El doble (10 de base)
            System.out.println(nombre + " ha jugado y está más feliz.");
        }
        else {
            System.out.println(nombre + " está muy cansado para juagar.");
        }
    }
}
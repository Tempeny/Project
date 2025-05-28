package com.mascotavirtual;

class HamsterVirtual extends MascotaVirtual{
    public HamsterVirtual(String nombre){
        super(nombre);
    }

    @Override
    public void jugar(){
        if (energia >= 10){
            energia -= 30; //Se cansa antes jugando 
            felicidad += 10;
            System.out.println(nombre + "ha jugado y está más feliz.");
        } else {
            System.out.println(nombre + "está muy cansado y no quiere jugar.");
        }
    }
}
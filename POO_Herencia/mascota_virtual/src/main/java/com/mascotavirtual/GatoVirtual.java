package com.mascotavirtual;


class GatoVirtual extends MascotaVirtual{

    public GatoVirtual(String nombre){
        super(nombre);
    }

    @Override
    public void comer(){
        energia += 20; //Gana mas energia que el resto cuando come
        System.out.println(nombre + " ha comido y recuperado energia.");

    }
}
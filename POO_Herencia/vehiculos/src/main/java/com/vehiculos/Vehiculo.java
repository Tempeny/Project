package com.vehiculos;

abstract class Vehiculo {
    String marca;
    int año;

    public Vehiculo(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    public abstract void arrancar();

    public void detener() {
        System.out.println(marca + " detenido.");
    }
}
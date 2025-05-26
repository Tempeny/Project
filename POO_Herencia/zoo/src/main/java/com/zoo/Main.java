package com.zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Akamaru", 3));
        animales.add(new Gato("Michi", 2));
        animales.add(new Pajaro("Chuntaro", 1));
        animales.add(new Perro("Koromaru", 4));
        animales.add(new Gato("Luna", 5));

        for (Animal animal : animales) {
            System.out.print(animal.nombre + " dice: ");
            animal.hacerSonido();
        }
    }
}
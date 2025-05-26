/*
Queremos simular cómo se comportan diferentes tipos de vehículos. 
Clase base: 
• Vehiculo con atributos String marca y int año. 
• Métodos: arrancar(), detener(). 
Subclases: 
• Coche: imprime "Coche arrancando...". 
• Moto: imprime "Moto lista para rodar.". 
• Bicicleta: sobrescribe arrancar() para imprimir "No necesita arrancar." 
Funcionamiento del programa: 
• Crea un array o lista con varios vehículos. 
• Llama a arrancar() y detener() para cada uno. */

package com.vehiculos;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Coche("Toyota", 2020),
            new Moto("Yamaha", 2018),
            new Bicicleta("Giant", 2022)
        };

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("\n" + vehiculo.marca + " (" + vehiculo.año + ")");
            vehiculo.arrancar();
            vehiculo.detener();
        }
    }
}
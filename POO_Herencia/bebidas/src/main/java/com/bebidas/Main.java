/*
Proyecto 2: Menú de Bebidas 
Crea un sistema para mostrar un menú de bebidas. 
Clase base: 
• Bebida con atributos String nombre y String tamaño. 
Subclases: 
• Refresco con atributo boolean conGas. 
• Zumo con atributo String fruta. 
• Agua con atributo boolean mineral. 
Cada clase tendrá su constructor correspondiente y un método getDescripcion() que devuelva una 
cadena con todos los detalles de la bebida. 
Funcionamiento del programa: 
• Crea una lista con distintas bebidas. 
• Recorre la lista y muestra la descripción de cada una usando getDescripcion(). 
*/
package com.bebidas;

public class Main {
    public static void main(String[] args) {
        Bebida[] bebidas = {
            new Refresco("Coca-Cola", "Mediano", true),
            new Zumo("Zumo Tropical", "Grande", "Mango"),
            new Agua("Agua Natural", "Pequeño", false),
            new Refresco("Aquarius", "Grande", false),
            new Agua("Agua Mineral", "Mediano", true)
        };

        for (Bebida bebida : bebidas) {
            System.out.println(bebida.getDescripcion());
        }
    }
}
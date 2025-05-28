package com.entradas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Entrada> entradas = new ArrayList<>();

        entradas.add(new EntradaEstandar("Concierto de Miku", 50.0));
        entradas.add(new EntradaEstandar("Concierto de Ado", 35.0));

        entradas.add(new EntradaVIP("Festival Música", 100.0, 0.30));
        entradas.add(new EntradaVIP("Gala de Cine", 120.0, 0.50));

        entradas.add(new EntradaConDescuento("Obra Infantil", 40.0, 0.25));
        entradas.add(new EntradaConDescuento("Cine Estudiantil", 20.0, 0.10));

        for (Entrada entrada : entradas) {
            System.out.println("Tipo de entrada: " + entrada.getClass().getSimpleName());
            System.out.println("Evento: " + entrada.getEvento());
            System.out.println("Precio base: " + entrada.getPrecioBase()+ " euros");
            System.out.println("Precio final: " + entrada.calcularPrecioFinal() + " euros");
            System.out.println("---------------------------------------");
        }
    }
}
package com.recetario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recetario recetario = new Recetario();
        int opcion;

        do{
            System.out.println("--Menú--");
            System.out.println("1. Añadir nueva receta");
            System.out.println("2. Mostrar resumen de recetas");
            System.out.println("3. Mostrar detalles de una receta");
            System.out.println("0. Salir");
            System.out.println("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
        
            switch (opcion){
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcion no valida");
                
            }
        } while (opcion != 0);
    }
}
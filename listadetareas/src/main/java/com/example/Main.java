package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Tarea> listaTareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        listaTareas.add(new Tarea(1, "Comprar pan", "Ir a la panadería y comprar pan fresco."));
        listaTareas.add(new Tarea(2, "Hacer ejercicio", "Realizar 30 minutos de entrenamiento."));
        listaTareas.add(new Tarea(3, "Leer un libro", "Leer al menos 20 páginas de un libro."));
        
        while (true) {
            System.out.println("\nGestión de Tareas:");
            System.out.println("1. Listar tareas");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            if (opcion == 3) {
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\nListado de tareas:");
                    for (Tarea tarea : listaTareas) {
                        tarea.logTarea();
                    }
                    break;
                case 2:
                    System.out.print("Introduce el ID de la tarea a completar: ");
                    int id = scanner.nextInt();
                    for (Tarea tarea : listaTareas) {
                        if (tarea.getIdTarea() == id) {
                            tarea.completar();
                            System.out.println("Tarea completada.");
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
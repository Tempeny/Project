package com.notas;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Añadir nota a un alumno");
            System.out.println("3. Mostrar promedios");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    alumnos.add(new Alumno(nombre));
                    System.out.println("Alumno agregado.");
                    break;

                case 2:
                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos registrados.");
                        break;
                    }

                    System.out.println("Seleccione el número del alumno:");
                    for (int i = 0; i < alumnos.size(); i++) {
                        System.out.println((i + 1) + ". " + alumnos.get(i).getAlumno());
                    }
                    int index3 = scanner.nextInt() - 1;
                    if (index3 < 0 || index3 >= alumnos.size()) {
                        System.out.println("Índice inválido.");
                        break;
                    }

                    System.out.print("Ingrese la nota (0-10): ");
                    double nota = scanner.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota fuera de rango.");
                    } else {
                        alumnos.get(index3).addNota(nota);
                        System.out.println("Nota agregada.");
                    }
                    break;

                case 3:
                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        for (Alumno alumno : alumnos) {
                            System.out.printf("Alumno: %s | Promedio: %.2f%n",
                                    alumno.getAlumno(), alumno.calcularPromedio());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
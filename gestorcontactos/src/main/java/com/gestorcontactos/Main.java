package com.gestorcontactos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Agenda de Contactos ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, telefono, email);
                    agenda.agregarContacto(nuevoContacto);
                    break;

                case 2:
                    System.out.print("Ingresa el nombre a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    agenda.buscarContacto(nombreBuscar);
                    break;

                case 3:
                    agenda.listaContactos();
                    break;

                case 4:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}

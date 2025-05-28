package com.mascotavirtual;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MascotaVirtual mascota = null;

        System.out.println("Elige 1 mascota:");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Hamster");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa el nombre de tu nueva mascota: ");
        String nombre = scanner.nextLine();

        switch (opcion){
            case 1:
                mascota = new PerroVirtual(nombre);
                break;
            case 2:
                mascota = new GatoVirtual(nombre);
                break;
            case 3: 
                mascota = new HamsterVirtual(nombre);
                break;
            default:
                System.out.println("Opción invalida");
        }

        int accion;
        do {

            System.out.println("Que quieres hacer con " + nombre + "?");
            System.out.println("1. Darle de comer");
            System.out.println("2. Jugar");
            System.out.println("3. Ver su estado");
            System.out.println("4. Despedirse");
            accion = scanner.nextInt();

            switch (accion){
                case 1:
                    mascota.comer();
                    break;
                case 2:
                    mascota.jugar();
                    break;
                case 3:
                    mascota.mostrarEstado();
                    break;
                case 4:
                    System.out.println("¡Hasta otra!");
                    break;
                default:
                    System.out.println("Opción invalida");
            }

        } while (accion != 4);

        scanner.close();        
    }
}
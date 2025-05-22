package com.cajero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Introduce el nombre del titular de la cuenta:");
        String nombreTitular = scanner.nextLine();
        cuenta.titular = nombreTitular;

        while (!salir) {
            System.out.println("Bienvenido/a : " + cuenta.titular);
            System.out.println("········Menú Cajero Automático········");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opción");

            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    Scanner depositar = new Scanner(System.in);
                    System.out.println("Introduce cuanto quieres depositar:");
                    int deposito = depositar.nextInt();
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    Scanner retirar = new Scanner(System.in);
                    System.out.println("Introduce cuanto quieres retirar: ");
                    int retiro = retirar.nextInt();
                    cuenta.retirar(retiro);
                    break;
                case 3: 
                    cuenta.consultarSaldo();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Gracias por utilizar el cajero");
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        }
        scanner.close();
    }
}
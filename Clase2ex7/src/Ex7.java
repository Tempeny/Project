import java.util.Scanner;

public class Ex7 {
    private static int suma(int num1, int num2) {
        return num1 + num2;
    }

    private static int resta(int num1, int num2) {
        return num1 - num2;
    }

    private static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    private static float dividir(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return (float) num1 / num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu de operaciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer numero: ");
                int num1 = scanner.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                int num2 = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("El resultado de la suma es: " + suma(num1, num2));
                        break;
                    case 2:
                        System.out.println("El resultado de la resta es: " + resta(num1, num2));
                        break;
                    case 3:
                        System.out.println("El resultado de la multiplicacion es: " + multiplicar(num1, num2));
                        break;
                    case 4:
                        System.out.println("El resultado de la division es: " + dividir(num1, num2));
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opcion no valida, intenta de nuevo.");
            }

        } while (opcion != 5);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}

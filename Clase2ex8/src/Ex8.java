//Generador de contraseñas aleatorias: Generar contraseñas con letras y números al azar, con longitud definida.

import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la contraseña: ");
        int lenght = scanner.nextInt();

        String password = genPassword(lenght);
        System.out.println("Contraseña generada: " + password);

        scanner.close();
    }

    public static String genPassword(int lenght) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < lenght; i++) {
            int index = random.nextInt(caracteres.length());
            password.append(caracteres.charAt(index));
        }

        return password.toString();
    }
}
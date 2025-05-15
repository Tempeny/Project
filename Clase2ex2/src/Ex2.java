import java.util.Scanner;

public class Ex2 {

    private static boolean palindromo(String word) {
        String inverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            inverse += word.charAt(i);
        }
        return word.equalsIgnoreCase(inverse);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una palabra para comprobar si es un palíndromo:");
        String word = scanner.nextLine();

        boolean resultado = palindromo(word);

        if (resultado) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }

        scanner.close();
    }
}

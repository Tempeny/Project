import java.util.Scanner;

public class Ex3 {

    private static int contadorVocales(String frase) {
        int contador = 0;
        String vocales = "aeiouAEIOU"; 

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (vocales.indexOf(caracter) != -1) { 
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();

        int totalVocales = contadorVocales(frase);

        System.out.println("La frase tiene " + totalVocales + " vocales.");
        scanner.close();
    }
}

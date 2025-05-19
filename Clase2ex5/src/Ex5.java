//Invertir un array: Mostrar un array en orden inverso. 
import java.util.Scanner;

public class Ex5 {
    private static int[] inverseArray(int[] array) {
        int[] aux = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[array.length - i - 1];
        }
        return aux;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array:");
        int num = scanner.nextInt();

        int[] array = new int[num];

        System.out.println("Introduce " + num + " numeros:");
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }

        int[] reversedArray = inverseArray(array);

        System.out.println("El array invertido es:");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        scanner.close();
    }
}

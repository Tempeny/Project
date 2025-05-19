// Ordenar un array sin Arrays.sort(): Ordenar los elementos de un array manualmente. 

import java.util.Scanner;

public class Ex6 {

    private static int[] ordenarArray(int[] array) {
        int x = array.length;
        for (int i = 0; i < x - 1; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        return array;
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

        array = ordenarArray(array);

        System.out.println("Array ordenado:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    scanner.close();
    }
}
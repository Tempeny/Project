//Buscar el mayor numero en un array
import java.util.Scanner;

public class Ex4 {

    private static int findMayor(int array[]) {
        
        int mayor = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > mayor ){
                mayor = array[i];
            }
        }

    return mayor;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array:");
        int num = scanner.nextInt();

        int array[] = new int[num];
        System.out.println("Introduce " + num + " numeros:");
        for (int i = 0; i < num ; i++){
            array[i] = scanner.nextInt();
        }

        int mayor = findMayor(array);

        System.out.println("El numero mayor del array es:" + mayor);

    }
}

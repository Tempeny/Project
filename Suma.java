import java.util.Scanner;

public class Suma{
    public static void main(String[] args){
        Scanner myNum = new Scanner(System.in);
        System.out.println("Introduce un número:");
        Integer num1 = myNum.nextInt();
        System.out.println("Introduce otro número");
        Integer num2 = myNum.nextInt();
        int res = num1 + num2;
        System.out.println("La suma de números da:" + res);
    }
    
}


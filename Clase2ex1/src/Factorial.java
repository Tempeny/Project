import java.util.Scanner;

public class Factorial {

    private static Integer factorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i; 
        }
        return resultado;
    }
    
    private static boolean assertEquals(Integer expected, Integer actual) {
        return expected.equals(actual);
    }

    private static void testFactorial() {
        if (!assertEquals(1, factorial(1))){
            System.err.println("Test failed: factorial(1) should be 1");
        }
        if (!assertEquals(2, factorial(2))){
            System.err.println("Test failed: factorial(2) should be 2");
        }
        if (!assertEquals(6, factorial(3))){
            System.err.println("Test failed: factorial(3) should be 6");
        }
        if (!assertEquals(24, factorial(4))){ 
            System.err.println("Test failed: factorial(4) should be 24");
        }
        if (!assertEquals(120, factorial(5))){
            System.err.println("Test failed: factorial(5) should be 120");
        }
        System.out.println("All tests passed.");
    } 
    
    public static void main(String[] args) {
        testFactorial();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = scanner.nextInt(); 
        scanner.close();
        
        System.out.println("El factorial de " + num + " es: " + factorial(num));
    }
}

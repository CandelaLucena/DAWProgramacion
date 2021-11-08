import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Array;
        Array = new int[10];
        
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Introduzca un numero:");
            Array[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = Array.length-1; i >= 0; i--) {
            System.out.println(Array[i]);
        }
    }
}
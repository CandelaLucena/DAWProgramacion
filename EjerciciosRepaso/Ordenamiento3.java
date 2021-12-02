//?

import java.util.Scanner;

public class Ordenamiento3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número:");
            numeros[i] = scanner.nextInt();
        }
        scanner.close();
    }
}

//import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];
        int mayor;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número:");
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        //Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 1; j < (numeros.length - i); j++) {
                if (numeros[j - 1] > numeros[j]) {
                    mayor = numeros[j - 1];
                    numeros[j - 1] = numeros[j];
                    numeros[j] = mayor;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
             System.out.print(numeros[i]+" ");
        }
    }
}

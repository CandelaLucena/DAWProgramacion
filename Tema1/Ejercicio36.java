import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros;
        double mayor = 0;
        numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextDouble();
        }
        scanner.close();

        mayor = numeros[0];

        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] > mayor){
                mayor = numeros[j];
            }
        }
        System.out.println(mayor);
    }
}

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros;
        double mayor = 0;
        double menor = 0;
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

        menor = numeros [0];

        for (int k = 0; k < numeros.length; k++) {
            if (numeros[k] < menor){
                menor = numeros[k];
            }
        }

        System.out.println("Mayor: "+mayor+"Menor: "+menor);
    }
}

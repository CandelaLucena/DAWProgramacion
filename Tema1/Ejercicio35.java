
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double[] notas;
        notas = new double[10];
        boolean sobresaliente = false;

        System.out.println("Introduzca 10 notas:");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextDouble();
            total = total + notas[i];
            if (notas[i] == 10) {
                sobresaliente = true;
            }
        }
        scanner.close();
        System.out.println("La media es igual a: "+ total/10);

        if (sobresaliente) {
            System.out.println("Hay diez");
        }else{
            System.out.println("No hay diez");
        }
    }
}

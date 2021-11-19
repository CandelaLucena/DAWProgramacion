import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int contador = 0;
        double numero = 0;
        System.out.println("Escriba un numero para saber sus divisores:");
        numero = scanner.nextDouble();
        scanner.close();

        for (int i = 0; i <= numero; i++) {
            if (numero%i == 0){
                System.out.println(i);
                contador++;
            }
        }

        System.out.println(numero+" tiene "+contador+"divisores");
    }
}

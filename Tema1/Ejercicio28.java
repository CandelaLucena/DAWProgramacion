
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        int numero = 0;
        int contador = 0;
        System.out.println("Escriba un numero.");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0){
                contador++;
            }
        }
        if (contador == 2){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
        scanner.close();
    }
}

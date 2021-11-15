
import java.util.Scanner;
public class Ejercicio25ConFor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial, numero;
        factorial = 1;
        System.out.println("Escriba un numero para calcular su factorial");
        numero = scanner.nextInt();

        for (int i = 2; i <= numero; i++){
            factorial = factorial * i;
        }
        System.out.println("El factorial es: "+ factorial);
        scanner.close();
    }
}
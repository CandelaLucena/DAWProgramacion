import java.util.Scanner;
public class Ejercicio25{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial, numero;
        factorial = 1;
        System.out.println("Escriba un numero para calcular su factorial");
        numero = scanner.nextInt();

        while (numero != 0){
            factorial = factorial * numero;
            numero = numero -1;
        }
        System.out.println("El factorial es: "+ factorial);
        scanner.close();
    }
}
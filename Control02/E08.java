import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double numero = 0, calculoDecimal = 0;
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextDouble();
        scanner.close();
        calculoDecimal = numero % 1;
        
        System.out.println(calculoDecimal);
    }
}

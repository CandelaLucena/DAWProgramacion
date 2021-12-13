import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        System.out.print("Ingrese un numero: ");
        numero = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero+" x "+i+" = "+numero*i);
        }
    }
}

package Control02;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero = 0;
        System.out.println("Ingrese numero: ");
        numero = scanner.nextInt();
        scanner.close();
        int primero = numero%10;
        int segundo = (numero/10)%10;
        int tercero = numero/100;

        System.out.println(primero+""+segundo+""+tercero);
    }
}

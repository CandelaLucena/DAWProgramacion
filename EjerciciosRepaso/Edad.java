//?

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        int dia;
        int mes;
        int anno;
        int edad;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento.");
        System.out.print("Dia:");
        dia = scanner.nextInt();
        System.out.print("Mes:");
        mes = scanner.nextInt();
        System.out.print("Anno:");
        anno = scanner.nextInt();
        scanner.close();
    }
}

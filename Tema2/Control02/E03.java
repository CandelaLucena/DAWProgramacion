package Tema2.Control02;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double primeraNota = 0, segundaNota = 0, terceraNota = 0, cuartaNota = 0, promedio = 0;

        System.out.println("Primera nota: ");
        primeraNota = scanner.nextDouble();
        System.out.println("Segunda nota: ");
        segundaNota = scanner.nextDouble();
        System.out.println("Tercera nota: ");
        terceraNota = scanner.nextDouble();
        System.out.println("Cuarta nota: ");
        cuartaNota = scanner.nextDouble();
        scanner.close();

        promedio = (primeraNota + segundaNota + terceraNota + cuartaNota) / 4;
        System.out.println("El promedio es: " + promedio);
    }
}

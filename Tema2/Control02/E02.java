package Tema2.Control02;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double radio = 0, calculoPerimetro = 0, calculoArea = 0;
        System.out.println("Ingrese el radio: ");
        radio = scanner.nextInt();
        scanner.close();

        calculoPerimetro = 2 * Math.PI * radio;
        calculoArea = Math.PI * radio * radio;

        System.out.println("Perimetro: "+ calculoPerimetro);
        System.out.println("Área: "+ calculoArea);
    }
}

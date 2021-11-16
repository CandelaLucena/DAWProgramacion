package Control02;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double primeraNota = 0, segundaNota = 0, terceraNota = 0, notaLaboratorio = 0;
        System.out.println("Ingrese nota certamen 1: ");
        primeraNota = scanner.nextDouble();
        System.out.println("Ingrese nota certamen 2: ");
        segundaNota = scanner.nextDouble();
        System.out.println("Ingrese nota laboratorio: ");
        notaLaboratorio = scanner.nextDouble();
        scanner.close();
        terceraNota = (60 - (notaLaboratorio * 0.3 * 3)) / (0.7 * primeraNota * segundaNota);

        System.out.println("Necesita nota "+terceraNota+" en el certamen 3");
    }
}

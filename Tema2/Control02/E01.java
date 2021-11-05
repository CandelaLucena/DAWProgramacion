package Tema2.Control02;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String nombre;
        System.out.println("Ingrese su nombre:");
        nombre = scanner.nextString();
        scanner.close();
        System.out.println("Hola, "+ nombre);
    }
}

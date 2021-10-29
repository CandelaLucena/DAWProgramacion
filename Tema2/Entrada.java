package Tema2;

import java.util.Scanner;

public class Entrada {
    public static int getInteger(){
        Scanner scanner = new Scanner (System.in);
        boolean hayEntero = scanner.hasNextInt();
        int numero;
        numero = 0;
        while (!hayEntero) {         
            scanner.nextLine();
        }
        scanner.close();
        return numero;
    }

    // public static double getDouble(){
    //     hasNextDouble();
    //     return;
    // }
}

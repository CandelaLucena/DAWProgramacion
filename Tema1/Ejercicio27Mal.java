package Tema1;
import java.util.Scanner;
public class Ejercicio27Mal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Escriba un numero para imprimir ese mismo numero y sus anteriores");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++){
            System.out.println(numero - i);
        }
        scanner.close();
    }
}
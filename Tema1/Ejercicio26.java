package Tema1;
import java.util.Scanner;
public class Ejercicio26{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Escriba un numero para mostrar su tabla de multiplicar");
        numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero +" x "+ i +" = "+ numero*i);
        }
        scanner.close();
    }
}
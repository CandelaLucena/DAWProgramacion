package Tema1;
import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador, numero, positivos;
        contador = 0;
        positivos = 0;
        numero = 0;

        while (contador < 10){
            System.out.println("Escribe diez numeros enteros positivos o negativos");
            numero = scanner.nextInt();
            if (numero >= 0){
                positivos = positivos + 1;
            }
        contador = contador + 1;
        }    
        System.out.println("Hay "+positivos+" numeros positivos");
        scanner.close();
    }
}
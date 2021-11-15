
import java.util.Scanner;
public class Ejercicio23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, positivos;
        positivos = 0;
        numero = 1;
        
        while (numero != 0){
            System.out.println("Escribe diez numeros enteros positivos o negativos");
            numero = scanner.nextInt();
            if(numero > 0){
                positivos = positivos + 1;
            }
        }    
        System.out.println("Hay "+positivos+" numeros positivos");
        scanner.close();
    }
}
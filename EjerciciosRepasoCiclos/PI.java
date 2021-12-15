//?
import java.util.Scanner;

public class PI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int contador = 0;

        double PI = 0;
        double resultado = 0;
        
        System.out.print("n: ");
        numero = scanner.nextInt();
        scanner.close();

        while (contador==numero) {
            if (!(contador%2==0)){
                resultado = resultado + (1/contador);
            }
            contador++;
        }

        PI = 4 * (1 - resultado);
        System.out.println(PI);
    }
}

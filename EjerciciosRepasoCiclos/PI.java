//?
import java.util.Scanner;

public class PI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        boolean comprobador = true;

        double PI = 0;
        double resultado = 0;
        
        System.out.print("n: ");
        numero = scanner.nextInt();
        scanner.close();

        while (contador==numero) {
            if (!(contador%2==0)&&(comprobador = true)){
                resultado = resultado + (1.0/contador);
                comprobador = false;
            }else if(!(contador%2==0)&&(comprobador = false)){
                resultado = resultado - (1.0/contador);
                comprobador = true;
            }
            contador++;
        }

        PI = 4 * (1 - resultado);
        System.out.println(PI);
    }
}

import java.util.Scanner;

public class PositivosVoid {
    public static void positivos(double [] numeros){
        Scanner scanner = new Scanner(System.in);
        numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextDouble();
        }

        scanner.close();
        
        for (int j = 0; j < numeros.length; j++) {
            if(numeros[j]> 0){
                System.out.println(numeros[j]+" es positivo");
            }
        }
        
    }
}

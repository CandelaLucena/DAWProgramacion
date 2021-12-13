// ?
import java.util.Scanner;

public class PotenciasdeDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        double potencia = 0;
        System.out.print("Ingrese un num: ");
        numero = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= numero; i++) {
            potencia = Math. pow(i,2);
            System.out.println(potencia);
        }
    }
}

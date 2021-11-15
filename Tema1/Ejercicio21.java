
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double año;
        System.out.println("Introduzca el año");
        año = scanner.nextInt();
        scanner.close();

        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))){
            System.out.println("Año bisiesto");
        }else{
        System.out.println("Año no bisiesto");
        }
    }
}
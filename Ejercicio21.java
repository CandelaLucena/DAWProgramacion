import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double año, calculo1, calculo2, calculo3;
        System.out.println("Introduzca el año");
        año = scanner.nextInt();
        scanner.close();
        calculo1 = año / 4;
        calculo2 = año / 100;
        calculo3 = año / 400;
        if ((calculo1 == 0) && ((calculo2 == 0) && !(calculo3 == 0))){
            System.out.println("Año bisiesto");
        }else{
        System.out.println("Año no bisiesto");
        }
    }
}
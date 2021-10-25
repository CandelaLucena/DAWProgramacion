import java.util.Scanner;
public class Ejercicio28{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero, calculoPar, calculoPar2, calculoEntero;

        System.out.println("Escriba un numero para saber si es primo");
        numero = scanner.nextInt();
        scanner.close();
        calculoPar = numero / 2;

        if (calculoPar == 0){
            System.out.println("No es primo");

        }else{
            for (int i = 1; i <= numero / 2; i++){
                calculoPar2 = i / 2;
                if (calculoPar2 != 0){
                    calculoEntero = numero / i;
                    if (calculoEntero == 0){
                        System.out.println("Es primo");
                    }
                }
            } 
        }   
    }
}

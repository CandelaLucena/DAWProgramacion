import java.util.Scanner;
public class Ejercicio28Mediocre{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, calculoEntero;

        System.out.println("Escriba un numero para saber si es primo");
        numero = scanner.nextInt();
        scanner.close();
        if (numero == 2){
            System.out.println("Es primo");
        }
        if (numero % 2 == 0){
            System.out.println("No es primo");

        }else{
            for (int i = 1; i <= numero / 2; i++){
                if (numero / 2 != 0){
                    calculoEntero = numero / i;
                    if (calculoEntero != 0){
                        System.out.println("Es primo");
                    }
                }
            } 
        }   
    }
}

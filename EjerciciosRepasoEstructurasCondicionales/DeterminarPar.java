import java.util.Scanner;

public class DeterminarPar {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número:");
        numero = scanner.nextInt();
        scanner.close();

        if(numero%2==0){
            System.out.println("Su número es par");
        }else{
            System.out.println("Su número es impar");
        }
    }
}

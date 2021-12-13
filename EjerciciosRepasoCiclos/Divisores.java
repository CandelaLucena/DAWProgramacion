import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        System.out.print("Ingrese numero: ");
        numero = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= numero; i++) {
            if(numero%i==0){
                System.out.print(i+" ");
            }
        }
    }
}

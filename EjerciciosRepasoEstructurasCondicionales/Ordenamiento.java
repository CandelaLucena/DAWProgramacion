import java.util.Scanner;

public class Ordenamiento {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número:");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese un número:");
        numero2 = scanner.nextInt();
        scanner.close();

        if(numero1>numero2){
            System.out.print(numero2+" "+numero1);
        }else{
            System.out.print(numero1+" "+numero2);
        }
    }
}

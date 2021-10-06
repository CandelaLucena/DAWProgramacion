import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        
        System.out.println("Introduzca un numero");
        x = sc.nextInt();
        sc.close();

            if (x >= 0) {
                System.out.println("Positivo");
                }else{
                    System.out.println("Negativo");
                }
    }
}

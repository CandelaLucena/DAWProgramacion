import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Introduzca dos numeros");
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();

            if (x>y){
            System.out.println(x +" es mayor");
            }else{
            System.out.println(y +" es mayor");
       }
    }
}
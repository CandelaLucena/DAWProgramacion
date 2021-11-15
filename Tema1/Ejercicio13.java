
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, ordenar;

        System.out.println("Introduzca dos numeros");
        x = scanner.nextInt();
        y = scanner.nextInt();

        System.out.println("Ascendente: 1 o Descendente: 2");
        ordenar = scanner.nextInt();

        scanner.close();

        if (ordenar == 1){
            if (x>y){
                System.out.println("Ascendente:" + y + "," +x);
            }else{
                System.out.println("Ascendente:" + x + "," +y);
            }
        }
        if (ordenar == 2){
            if (x<y){
                System.out.println("Descendente:" + y + "," +x);
            }else{
                System.out.println("Descendente:" + x + "," +y);
            }
        }
    }
}

        
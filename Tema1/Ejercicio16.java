import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacion, x, y;

        System.out.println("Introduzca x e y");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("Introduzca el simbolo de la operación");
        operacion = scanner.nextInt();
        scanner.close();

    }
}
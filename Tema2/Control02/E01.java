import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String nombre;
        System.out.print("Ingrese su nombre:");
        nombre = scanner.nextLine();
        scanner.close();
        System.out.println("Hola, "+ nombre);
    }
}

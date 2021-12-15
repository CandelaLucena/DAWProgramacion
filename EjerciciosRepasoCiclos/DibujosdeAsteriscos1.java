import java.util.Scanner;

public class DibujosdeAsteriscos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAltura = 0;
        int numeroAncho = 0;
        System.out.print("Altura: ");
        numeroAltura = scanner.nextInt();
        System.out.print("Ancho: ");
        numeroAncho = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < numeroAltura; i++) {
            for (int j = 0; j < numeroAncho; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

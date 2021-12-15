import java.util.Scanner;

public class DibujosdeAsteriscos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAltura = 0;
        int contador = 0;
        System.out.print("Altura: ");
        numeroAltura = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < numeroAltura; i++) {
            contador++;
            for (int j = 0; j < contador; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}

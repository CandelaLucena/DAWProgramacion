import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double longitud = 0, pulgada = 2.54;
        System.out.println("Ingrese longitud: ");
        longitud = scanner.nextDouble();
        scanner.close();
        
        System.out.println(longitud + "cm = "+(longitud / pulgada)+"in");
    }
}

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precio1Real, precio2Rebajado, descuento;
        System.out.println("Escriba precio real");

        precio1Real = sc.nextInt ();

        System.out.println("Escriba precio rebajado");

        precio2Rebajado = sc.nextInt ();

        descuento = (precio1Real-precio2Rebajado)/precio1Real*100;

        System.out.println("Descuento: "+descuento);

        sc.close();
    }
}

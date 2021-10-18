import java.util.Scanner;
public class Ejercicio20ConElseif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio, calculoDescuento, precioFinal;
        System.out.println("Introduzca el precio");
        precio = scanner.nextInt();
        scanner.close();

        if(precio < 6){
            System.out.println("Descuento: 0");
            System.out.println("Precio: "+ precio);
        }
        else if(precio < 60){
            calculoDescuento = precio * 0.05;
            precioFinal = precio - calculoDescuento;
            System.out.println("Descuento : "+ calculoDescuento);
            System.out.println("Precio: "+ precioFinal);
        }
        else{
            calculoDescuento = precio * 0.1;
            precioFinal = precio - calculoDescuento;
            System.out.println("Descuento : "+ calculoDescuento);
            System.out.println("Precio: "+ precioFinal);
        }
    }
}
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	
        double radius, length, area;
        System.out.println("Escriba el radio");

        final double PI = 3.14159;
        radius = sc.nextInt ();
		length = 2*PI*radius;
        area = PI*radius*radius;

        System.out.println("Area: "+area +" Longitud: "+length);
        sc.close();
    }
}

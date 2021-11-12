
import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int x, y, sum, sub, mult, div;
        System.out.println("Escriba dos numeros");

        x = sc.nextInt ();
		y = sc.nextInt ();
        sum = x+y;
        sub = x-y;
        mult = x*y;
        div = x/y;

        System.out.println("Resultados "+" sum: "+sum +" sub: "+sub +" mult: "+mult +" div: "+div);
        sc.close ();
    }
}   
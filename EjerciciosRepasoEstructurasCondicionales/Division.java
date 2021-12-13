import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int dividendo;
        int divisor;
        int cociente;
        int resto;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dividendo:");
        dividendo = scanner.nextInt();
        System.out.print("Divisor:");
        divisor = scanner.nextInt();
        scanner.close();

        if(dividendo%divisor==0){
            System.out.println("La división es exacta.");
            cociente = dividendo/divisor;
            resto = dividendo%divisor;
            System.out.println("Cociente: "+cociente);
            System.out.println("Resto: "+resto);
        }else{
            System.out.println("La división no es exacta.");
            cociente = dividendo/divisor;
            resto = dividendo%divisor;
            System.out.println("Cociente: "+cociente);
            System.out.println("Resto: "+resto);
        }
    }
}

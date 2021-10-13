import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y;
        String operacion;

        System.out.println("Introduzca x e y");
        x = scanner.nextInt();
        y = scanner.nextInt();

        System.out.println("Introduzca el simbolo de la operación");
        operacion = scanner.next();
        scanner.close();
        
            switch (operacion){
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            default:
                break;
        }
    }
}
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int operando1;
        String operador;
        int operando2;
        int resultado;
        String mas = "+";
        String menos = "-";
        String divisor = "/";
        String multiplicador = "*";
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Operando:");
        operando1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Operando:");
        operador = scanner.nextLine();
        System.out.print("Operando:");
        operando2 = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        if(operador.equals(mas)){
            resultado = operando1 + operando2;
            System.out.print(operando1+" + "+operando2+" = "+resultado);
        }
        else if(operador.equals(menos)){
            resultado = operando1 - operando2;
            System.out.print(operando1+" - "+operando2+" = "+resultado);
        }
        else if(operador.equals(divisor)){
            resultado = operando1 / operando2;
            System.out.print(operando1+" / "+operando2+" = "+resultado);
        }
        else if(operador.equals(multiplicador)){
            resultado = operando1 * operando2;
            System.out.print(operando1+" * "+operando2+" = "+resultado);
        }
    }
}

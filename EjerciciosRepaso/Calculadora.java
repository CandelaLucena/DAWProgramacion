//?

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int operando1;
        String operador;
        int operando2;
        int resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Operando:");
        operando1 = scanner.nextInt();
        System.out.print("Operando:");
        operador = scanner.nextLine();
        System.out.print("Operando:");
        operando2 = scanner.nextInt();
        scanner.close();

        if(operador == "+"){
            resultado = operando1 + operando2;
            System.out.print(operando1+" + "+operando2+" = "+resultado);
        }
        if(operador == "-"){
            resultado = operando1 - operando2;
            System.out.print(operando1+" - "+operando2+" = "+resultado);
        }
        if(operador == "/"){
            resultado = operando1 / operando2;
            System.out.print(operando1+" / "+operando2+" = "+resultado);
        }
        if(operador == "**"){
            resultado = operando1 * operando2;
            System.out.print(operando1+" * "+operando2+" = "+resultado);
        }
    }
}

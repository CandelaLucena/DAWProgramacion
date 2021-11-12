package Tema1;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeroHorasTrabajadas, cobroPorHora, salarioBruto = 0, salarioNeto = 0, impuesto = 0, salarioExtra, salarioCalculo;

        System.out.println("Introduzca el cobro por hora");
        cobroPorHora = scanner.nextInt();
        System.out.println("Introduzca las horas trabajadas");
        numeroHorasTrabajadas = scanner.nextInt();
        scanner.close();

        if (numeroHorasTrabajadas <= 35){
            salarioBruto = numeroHorasTrabajadas * cobroPorHora;
        }
        if (numeroHorasTrabajadas > 35){
            salarioCalculo = 35 * cobroPorHora;
            salarioExtra = (numeroHorasTrabajadas - 35) * cobroPorHora * 1.5;
            salarioBruto = salarioCalculo + salarioExtra;
        }
        if ((salarioBruto > 500) && (salarioBruto <= 900)){
            salarioNeto = ((salarioBruto - 500) * 0.75 + 500);
            impuesto = salarioBruto - salarioNeto;
        }
        if (salarioBruto > 900){
            salarioNeto = ((salarioBruto - 900) * 0.55) + 500 + (400 * 0.75);
            impuesto = salarioBruto - salarioNeto;
        }
        System.out.println("Salario bruto: "+salarioBruto);
        System.out.println("Salario neto: "+salarioNeto);
        System.out.println("Impuesto: "+impuesto);
    }
}
import java.util.Scanner;

public class Ordenamiento2 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int mayor;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número:");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese un número:");
        numero2 = scanner.nextInt();
        System.out.print("Ingrese un número:");
        numero3 = scanner.nextInt();
        scanner.close();


        if(numero1>numero2&&numero1>numero3){
            mayor = numero1;
            if(numero2>numero3){
                System.out.print(numero3+" "+numero2+" "+mayor);
            }else{
                System.out.print(numero2+" "+numero3+" "+mayor);
            }
        }
        if(numero2>numero1&&numero2>numero3){
            mayor = numero2;
            if(numero1>numero3){
                System.out.print(numero3+" "+numero1+" "+mayor);
            }else{
                System.out.print(numero1+" "+numero3+" "+mayor);
            }
        }
        if(numero3>numero1&&numero3>numero2){
            mayor = numero3;
            if(numero1>numero2){
                System.out.print(numero2+" "+numero1+" "+mayor);
            }else{
                System.out.print(numero1+" "+numero2+" "+mayor);
            }
        }
    }
}

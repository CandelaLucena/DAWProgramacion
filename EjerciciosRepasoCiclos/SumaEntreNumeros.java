import java.util.Scanner;

public class SumaEntreNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int suma = 0;
        System.out.print("Ingrese un num: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese un num: ");
        numero2 = scanner.nextInt();
        scanner.close();
        
        if(numero1>numero2){
            for (int i = numero2+1; i < numero1; i++) {
                suma = suma+i;
            }
            System.out.print("La suma es "+suma);
        }else if(numero2>numero1){
            for (int i = numero1+1; i < numero2; i++) {
                suma = suma+i;
            }
            System.out.print("La suma es "+suma);
        }
    }
}

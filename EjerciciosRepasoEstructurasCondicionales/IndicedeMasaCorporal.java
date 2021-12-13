import java.util.Scanner;

public class IndicedeMasaCorporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        double IMC = 0.0;

        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();
        System.out.print("Ingrese su IMC: ");
        IMC = scanner.nextDouble();
        scanner.close();

        if((edad<45)&&(IMC<22.0)){
            System.out.println("Bajo");
        }else if((edad>=45)&&(IMC<22.0)){
            System.out.println("Medio");
        }else if((edad<45)&&(IMC>=22.0)){
            System.out.println("Medio");
        }else if((edad>=45)&&(IMC>=22.0)){
            System.out.println("Alto");
        }
    }
}

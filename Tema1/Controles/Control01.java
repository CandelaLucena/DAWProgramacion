import java.util.Scanner;
public class Control01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lados;
        double longitud, perimetro;
        System.out.println("Dime el número de lados del polígono:");
        lados = scanner.nextInt();

        if ((lados = 3) && (lados = 4)){
            if (lados = 3){
                System.out.println("Dime la longitud del lado del polígono:");
                longitud = scanner.nextDouble();
                scanner.close();
                perimetro = longitud * 3;
                System.out.println("El perímetro del triángulo es"+ perimetro);
            }
            if (lados = 4){
                System.out.println("Dime la longitud del lado del polígono:");
                longitud = scanner.nextDouble();
                scanner.close();
                perimetro = longitud * 4;
                System.out.println("El perímetro del cuadrado es"+ perimetro);
            }
        }else{
        }
    }
}
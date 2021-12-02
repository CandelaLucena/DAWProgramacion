import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese a:");
        a = scanner.nextDouble();
        System.out.print("Ingrese b:");
        b = scanner.nextDouble();
        System.out.print("Ingrese c:");
        c = scanner.nextDouble();

        if(!(a+b<c)&&!(a+c<b)&&!(b+c<a)){
            if(a==b&&a==c&&b==c){
                System.out.print("El triangulo es equilatero.");
            }
            else if(a==b||a==c||b==c){
                System.out.print("El triangulo es isosceles.");
            }
            else if(!(a==b)&&!(a==c)&&!(b==c)){
                System.out.print("El triangulo es escaleno.");
            }
        }else{
            System.out.print("No es un triangulo valido.");
        }
    }
}

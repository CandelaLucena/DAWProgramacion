import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double catetoA = 0, catetoB = 0, hipotenusaSinRaiz = 0, hipotenusaConRaiz = 0;
        System.out.println("Ingrese cateto a: ");
        catetoA = scanner.nextDouble();
        System.out.println("Ingrese cateto b: ");
        catetoB = scanner.nextDouble();
        scanner.close();

        hipotenusaSinRaiz = (catetoA * catetoA) + (catetoB * catetoB);
        hipotenusaConRaiz = Math.sqrt(hipotenusaSinRaiz);

        System.out.println("La hipotenusa es: "+ hipotenusaConRaiz);
    }
}

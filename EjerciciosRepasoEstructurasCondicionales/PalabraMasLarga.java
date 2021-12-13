import java.util.Scanner;

public class PalabraMasLarga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra1;
        String palabra2;
        System.out.print("Palabra 1:");
        palabra1 = scanner.nextLine();
        System.out.print("Palabra 2:");
        palabra2 = scanner.nextLine();
        scanner.close();

        if(palabra1.length()>palabra2.length()){
            System.out.print("La palabra "+palabra1+" tiene "+(palabra1.length()-palabra2.length())+" letras mas que "+palabra2);
        }else{
            System.out.print("La palabra "+palabra2+" tiene "+(palabra2.length()-palabra1.length())+" letras mas que "+palabra1);
        }

        if(palabra1.length()==palabra2.length()){
            System.out.print("Las dos palabras tienen el mismo largo");
        }
    }
}

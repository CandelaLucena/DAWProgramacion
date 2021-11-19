import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numeroVocales = 0;
        String cadenaTexto;
        System.out.print("Ingrese el texto:");
        cadenaTexto = scanner.nextLine();
        scanner.close();
        for (int i = 0; i < cadenaTexto.length(); i++) {
            if ((cadenaTexto.charAt(i)== 'a')||(cadenaTexto.charAt(i)== 'e')||(cadenaTexto.charAt(i)== 'i')||(cadenaTexto.charAt(i)== 'o')||(cadenaTexto.charAt(i)== 'u')){
                numeroVocales++;
            }
        }
        System.out.println("El numero de vocales es: "+numeroVocales);
    }
}

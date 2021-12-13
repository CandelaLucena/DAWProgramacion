import java.util.Scanner;

public class LetraONumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letraNumero;
        
        System.out.print("Ingrese caracter: ");
        letraNumero = scanner.next();
        scanner.close();

        char leerLetraNumero = letraNumero.charAt(0);

        if((leerLetraNumero>='0')&&(leerLetraNumero<='9')){
            System.out.println("Es un numero");
        }else if((leerLetraNumero>='a')&&(leerLetraNumero<='z')){
            System.out.println("Es letra minúscula.");
        }else if((leerLetraNumero>='A')&&(leerLetraNumero<='Z')){
            System.out.println("Es letra mayúscula.");
        }else{
            System.out.println("No es letra ni número.");
        }
    }
}
import java.util.Scanner;

public class Entrada {
    public static int getInteger(){
        Scanner scanner = new Scanner (System.in);
        boolean hayEntero = scanner.hasNextInt();
        hayEntero = false;
        int numero;
        numero = 0;
        String mensaje = "Escriba un entero";
        System.out.println(mensaje);

        while (!hayEntero) {         
            if(scanner.hasNextLine() && scanner.hasNextInt()){
                numero = scanner.nextInt();
                hayEntero = true;
            }else{
            System.out.println(mensaje);
            }
            scanner.nextLine();
        }
        scanner.close();
        return numero;
    }
}
    

    // public static double getDouble(){
    //     hasNextDouble();
    //     return;
    // }


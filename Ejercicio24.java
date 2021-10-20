import java.util.Scanner;
public class Ejercicio24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notas, excelentes, suma, notamedia;
        excelentes = 0;
        notas = 0;
        suma = 0;
        notamedia = 0;

        while (notas != -1){
            System.out.println("Escribe las notas");
            notas = scanner.nextInt();
            if (notas == 10){
                excelentes = excelentes + 1;
            }
        }    
        suma = suma + notas;
        
        notamedia = suma / notas;
        System.out.println("Hay "+excelentes+" excelentes y la nota media es: "+notamedia);
        scanner.close();
    }
}
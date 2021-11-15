
import java.util.Scanner;
public class Ejercicio24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notas, excelentes, contador;
        double notamedia;
        excelentes = 0;
        notas = 0;
        notamedia = 0;
        contador = 0;

        while (notas != -1){
            System.out.println("Escribe las notas");
            notas = scanner.nextInt();
            if (notas > -1){
                notamedia = notamedia + notas;
                contador ++;
            if (notas == 10){
                excelentes = excelentes + 1;
            }  
            } 
        }
        
        if (contador > 0){
            System.out.println("Hay "+excelentes+" excelentes y la nota media es: "+notamedia/contador);
        }else{
            System.out.println("Hay 0 excelentes y la nota media es: "+0);
        }
        scanner.close();
    }
}
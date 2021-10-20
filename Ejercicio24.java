import java.util.Scanner;
public class Ejercicio24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador, notas, excelentes;
        contador = 0;
        excelentes = 0;
        notas = 0;

        while (contador < 10){
            System.out.println("Escribe diez numeros enteros positivos o negativos");
            notas = scanner.nextInt();
            
            if (notas == 10){
                excelentes = excelentes + 1;
            }
            if (contador == -1){
                contador = 10;
            }
        }    
        System.out.println("Hay numeros positivos");
        scanner.close();
    }
}
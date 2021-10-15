import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas, minutos, segundos;

        System.out.println("Introduzca hora, minutos y segundos.");
        horas = scanner.nextInt();
        minutos = scanner.nextInt();
        segundos= scanner.nextInt();
        scanner.close();
        segundos ++;

        if (segundos >= 60){
            minutos ++;
            segundos = 0;
        }
        if (minutos >= 60){
            horas ++;
            minutos = 0;
        }
        if (horas > 24){
            horas = 0;
            minutos = 0;
            segundos = 0;
        }
        System.out.println(horas+":"+minutos+":"+segundos);
    }
}
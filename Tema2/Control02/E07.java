package Control02;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numeroHorasActuales = 0, numeroHorasAdelantadas = 0, horas = 0;
        System.out.println("Ingrese hora actual: ");
        numeroHorasActuales = scanner.nextInt();
        System.out.println("Ingrese cantidad de horas: ");
        numeroHorasAdelantadas = scanner.nextInt();

        horas = (numeroHorasActuales + numeroHorasAdelantadas) % 24;
        System.out.println("En "+numeroHorasAdelantadas+" horas, el reloj marcará las "+horas);
        scanner.close();
        
    }
}

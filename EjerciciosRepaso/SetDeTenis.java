import java.util.Scanner;

public class SetDeTenis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int equipoA = 0;
        int equipoB = 0;
        
        System.out.print("Juegos ganados por A: ");
        equipoA = scanner.nextInt();
        System.out.print("Juegos ganados por B: ");
        equipoB = scanner.nextInt();
        scanner.close();

        if((equipoA-equipoB == 2)||(equipoB-equipoA == -2)){
            System.out.println("Gano A");
        }else if((equipoB-equipoA == 2)||(equipoA-equipoB == -2)){
            System.out.println("Gano B");
        }else if((equipoB-equipoA > 2)||(equipoA-equipoB < -2)||(equipoA-equipoB > 2)||(equipoB-equipoA < -2)){
            System.out.println("Invalido");
        }
    }
}

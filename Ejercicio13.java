import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        boolean Ascendente, Descendente;
        System.out.println("Introduzca dos numeros");

        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();

        System.out.println("Ascendente o Descendente");
            if (Ascendente){
                if (x>y)
                System.out.println("Ascendente: "+y+", "+x);
                }else{
                System.out.println("Ascendente: "+x+", "+y);
                }
            
            }
            
        }
        
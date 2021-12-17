import java.util.Scanner;

public class secuenciasdeCollatznumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        
        System.out.print("n: ");
        numero = scanner.nextInt();
        scanner.close();

        for (int i = 1; i < numero; i++) {
            while(!(numero == 1)){
                if(numero%2==0){
                    numero = numero / 2;
                }else{
                    numero = (numero * 3) + 1;
                }
                System.out.print(numero+" ");
            } 
        }

    }
}

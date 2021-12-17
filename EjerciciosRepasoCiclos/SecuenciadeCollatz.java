import java.util.Scanner;

public class SecuenciadeCollatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.print("n: ");
        numero = scanner.nextInt();
        scanner.close();

        System.out.println();
        System.out.print(numero+" ");

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
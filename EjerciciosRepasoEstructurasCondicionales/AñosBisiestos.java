//?

import java.util.Scanner;

public class AñosBisiestos {
    public static void main(String[] args) {
        int anno;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un anno:");
        anno = scanner.nextInt();
        scanner.close();
        if(anno%4==0){
            if(anno%100==0){
                if(anno%400==0){
                    System.out.print(anno+" es bisiesto");
                }
                System.out.print(anno+" no es bisiesto");
            }else{
                System.out.print(anno+" es bisiesto");
            }
        }else{
            System.out.print(anno+" no es bisiesto");
        }
    }
}

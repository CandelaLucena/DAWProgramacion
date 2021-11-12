package Tema1;

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Introduzca una edad");
        edad = sc.nextInt();
        sc.close();

            if (edad >= 18) {
              System.out.println("Tienes la edad legal");  
              }else{
              System.out.println("No tienes la edad legal"); 
        
            }
    }
    
}
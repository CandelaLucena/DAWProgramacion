package Tema1;

import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte x = 0;

        System.out.println("Introduzca la nota");
        x = scanner.nextByte();
        scanner.close();

        if ((x >= 0) && (x < 3)){
            System.out.println("Muy Deficiente");
            }else{
            }
        if ((x >= 3) && (x < 5)){
            System.out.println("Insuficiente");
            }else{
            }
        if ((x >= 5) && (x < 7)){
            System.out.println("Bien");
            }else{
            }
        if ((x >= 7) && (x < 9)){
            System.out.println("Notable");
            }else{
            }
        if ((x >= 9) && (x <= 10)){
            System.out.println("Sobresaliente");
            }else{
            }                   
        }
    }

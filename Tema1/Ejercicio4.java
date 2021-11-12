package Tema1;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String args[]) {
        float side;
        float squareArea; 
        
        System.out.println("Inserte un lado:");

        Scanner inputValue; 

        inputValue = new Scanner(System.in);

        side = inputValue.nextFloat();

        squareArea = side * side;
        System.out.println(squareArea);
        inputValue.close();
    }
}
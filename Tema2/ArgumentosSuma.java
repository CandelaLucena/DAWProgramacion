package Tema2;
public class ArgumentosSuma{
    public static void main(String [] args) {
        int suma = 0;
        for (int i = 0; i < args.length; i++) {
            int temp = Integer.parseInt(args[i]);
            suma = suma + temp;
        }
        System.out.println(suma);
    }
}
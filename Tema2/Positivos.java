package Tema2;

public class Positivos {
    public static int positivos(int [] numeros){
        int resultado = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>=0){
                resultado++;
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] numeros2 = {5, 4, 7, -2, 10, 1};
        System.out.println (positivos(numeros2));
    }
}

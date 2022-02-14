public class ArrayMultiplosEImprimir {
    public static void main(String[] args) {
        int [] numeros = new int [1000];

        int multiplo3 = 3;
        int multiplo7 = 7;

        for (int i = 0; i < numeros.length; i = i + 2) {
            numeros[i] = multiplo3;
            multiplo3 = multiplo3 + 3;
        }

        for (int i = 1; i < numeros.length; i = i + 2) {
            numeros[i] =  multiplo7;
            multiplo7 = multiplo7 +7;
        }

        for (int i = 13; i < numeros.length; i = i + 13) {
            System.out.println(numeros[i]);
        }
    }
}

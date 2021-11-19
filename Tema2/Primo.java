public class Primo {
    public static boolean esPrimo(int x){
        boolean resultado = false;
        int contador = 0;
        System.out.println("Escriba un numero.");

        for (int i = 1; i < x; i++) {
            if (x % i == 0){
                contador++;
            }
        }
        if (contador == 2){
            System.out.println("El numero es primo");
            resultado = true;
        }else{
            System.out.println("El numero no es primo");
        }
        return resultado;
    }
}

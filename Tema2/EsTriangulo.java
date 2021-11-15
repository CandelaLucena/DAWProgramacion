public class EsTriangulo {
    
    public static boolean esTriangulo(int palo1, int palo2, int palo3){
        boolean resultado = true;

        if (palo1+palo2 < palo3) {
            resultado = false;
        }
        if (palo2+palo3 < palo1) {
            resultado = false;
        }
        if (palo1+palo3 < palo2) {
            resultado = false;
        }

        return resultado;
    }
}
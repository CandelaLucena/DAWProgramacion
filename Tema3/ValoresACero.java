public class ValoresACero {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int numFilasCero = 0;
        int numColumnasCero = 0;
        Utilidades.rellenaMatriz(matriz, 0, 1);

        for (int i = 0; i < matriz.length; i++) {
            boolean esFilasCero = true;
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j]==0){
                    esFilasCero = false;
                    break;
                }
            }
            if(esFilasCero){
                numFilasCero++;
            }
        }
        System.out.println("Filas a cero: "+numFilasCero);

        for (int i = 0; i < matriz.length; i++) {
            boolean esColumnaCero = true;
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[j][i]==0){
                    esColumnaCero = false;
                    break;
                }
            }
            if(esColumnaCero){
                numColumnasCero++;
            }
        }
        System.out.println("Columnas a cero: "+numColumnasCero);
    }
}

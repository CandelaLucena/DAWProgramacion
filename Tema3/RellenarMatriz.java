public class RellenarMatriz {
    public static void main(String[] args) {
        int [][] miMatriz = new int [10][10];
        Utilidades.rellenaMatriz(miMatriz,0,1);
        mMatriz(miMatriz);

    }
    public static void mMatriz(int matriz[][]) {
        int i,j; 
        int filas = matriz.length;
        int columnas = matriz[0].length;
        // Recorrido de las filas de la matriz
        for (i=0; i < filas; i++) {
              // Recorrido de las celdas de una fila
              for (j=0; j<columnas; j++) {
                  System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j] );
            }
        }
    }
}

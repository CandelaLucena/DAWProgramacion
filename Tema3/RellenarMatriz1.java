public class RellenarMatriz1 {
    public static void main(String[] args) {
        int [][] miMatriz = new int [10][10];
        Utilidades.rellenaMatriz(miMatriz,0,1);
        mMatriz(miMatriz);

    }
    public static void mMatriz(int matriz[][]) {
        int i,j; 
        int filas = matriz.length;
        int columnas = matriz[0].length;
    
        for (i=0; i < filas; i++) {
              
              for (j=0; j<columnas; j++) {
                  System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}

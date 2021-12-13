public class Tablero1 {
    public static void main(String[] args) {
        int [][] matriz = new int [8][8];

        Utilidades.rellenaMatriz(matriz,0,3);
    }
    
    public static void 	mMatriz(int matriz[][]) {
		int i,j; 
		int filas = matriz.length;
		int columnas = matriz[0].length;
		// Recorrido de las filas de la matriz
		for (i=0; i < filas; i++) {
			  // Recorrido de las celdas de una fila
			  for (j=0; j<columnas; j++) {
				  System.out.print(matriz[i][j]+" ");
			}
            System.out.println();
		}
	}
}

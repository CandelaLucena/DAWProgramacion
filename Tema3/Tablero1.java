public class Tablero1 {
    public static void main(String[] args) {
        int [][] matriz = new int [8][8];

        Utilidades.rellenaMatriz(matriz,0,3);
		mMatriz(matriz);
    }
    
    public static void 	mMatriz(int matriz[][]) {
		int i,j; 
		int filas = matriz.length;
		int columnas = matriz[0].length;
		char letras = 'A';
		// Recorrido de las filas de la matriz
		System.out.print("  1 2 3 4 5 6 7 8 ");
		System.out.println();
		for (i=0; i < filas; i++) {
				System.out.print(letras+" ");
			  // Recorrido de las celdas de una fila
			  for (j=0; j<columnas; j++) {
				  if(matriz[i][j]==0){
					System.out.print(". ");
				  }else if(matriz[i][j]==1){
					System.out.print("+ ");
				  }else if(matriz[i][j]==2){
					System.out.print("0 ");
				  }else if(matriz[i][j]==3){
					System.out.print("X ");
				}
			}
			letras++;
            System.out.println();
		}
	}
}

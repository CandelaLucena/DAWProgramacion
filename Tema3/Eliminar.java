public class Eliminar {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int indice = 2;
        eliminar(array, indice);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void eliminar(int[] array, int x){
        int posicionBorrar;
        posicionBorrar = x;
        int elementoBorrado = array[x];

        for (int i = posicionBorrar; i < array.length-1; i++) {
            array[i] = array[i+1];
        }

        array[array.length-1]=elementoBorrado;
    }
}
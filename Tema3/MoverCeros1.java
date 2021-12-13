public class MoverCeros1 {
    public static void main(String[] args) {
        int[] array1 = {1,0,2,3,4,0,0,5,6,0,7,8,9,0,10};
        moverCeros(array1);

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

    public static void moverCeros(int[]array1){
        for (int j = array1.length - 1; j >= 0; j--) {
            if (array1[j]==0){
                for (int k = j; k < array1.length-1; k++) {
                    array1[k]=array1[k+1];
                    array1[k+1] = 0;
                }
            }
        }
    }
}

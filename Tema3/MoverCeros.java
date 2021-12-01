public class MoverCeros {
    public static void main(String[] args) {
        int[] array1 = {1,0,2,3,4,0,0,5,6,0,7,8,9,0,10};
        moverceros(array1);

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

    public static void moverceros(int[]array1){
        for (int j = 0; j < array1.length; j++) {
            if (array1[j]==0){
                array1[j]=array1[j+1];
            }
        }
    }
}

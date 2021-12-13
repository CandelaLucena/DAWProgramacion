public class Comunes1 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {1,10,11,12,3,16,18,1,9,6};
        comunes(array1, array2);
    }

    public static void comunes(int[]array1, int[]array2){
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }
}

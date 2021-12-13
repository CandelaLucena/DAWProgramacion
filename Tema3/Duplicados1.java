public class Duplicados1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 5, 5, 8, 9, 10, 2};
        duplicados(array);
    }
    public static void duplicados(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }
}

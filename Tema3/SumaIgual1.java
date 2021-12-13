public class SumaIgual1 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int x = 5;
        sumaigual(array1, x);
    }

    public static void sumaigual(int[] array1, int x){
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i]+array1[j]==x){
                    System.out.println(array1[i]+"+"+array1[j]+"="+x);
                }
            }
        }
    }
}

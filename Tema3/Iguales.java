public class Iguales {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        iguales(array1, array2);
    }

    public static boolean iguales(int[]array1, int[]array2){
        boolean igual = true;
        if (array1.length != array2.length){
            System.out.println("No son iguales");
            igual = false;
        }else{
            for (int i = 0; i < array2.length; i++) {
                if (array1[i] != array2[i]){
                    System.out.println("No son iguales");
                    igual = false;
                    break;
                }
            }
        }
        if (igual = true){
            System.out.println("Es igual");
        }
        return igual;
    }
}

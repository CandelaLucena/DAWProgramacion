public class ParesImpares1 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        paresimpares(array1);
    }
    public static void paresimpares(int[]array1){
        int enterosPares = 0;
        int enterosImpares = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i]%2==0){
                System.out.println(array1[i]+" es entero par");
                enterosPares++;
            }else{
                System.out.println(array1[i]+" es entero impar");
                enterosImpares++;
            }
        }
        System.out.println("Hay "+enterosPares+" enteros pares");
        System.out.println("Hay "+enterosImpares+" enteros impares");
    }
}

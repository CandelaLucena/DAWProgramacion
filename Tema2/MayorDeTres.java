public class MayorDeTres {
    public static void mayordetres(int x, int y, int z){
        int[] numeros;
        int mayor;
        numeros = new int[3];
        numeros[0] =  x; 
        numeros[1] = y;
        numeros[2] = z;

        mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println(mayor);
    }
}

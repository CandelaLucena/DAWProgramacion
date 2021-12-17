public class Digitos {
    public static void main(String[] args) {
        String letraNumero = "hola1,2,3,4";
        int contador = 0;
        char[] array = letraNumero.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if((array[i]>='0')&&(array[i]<='9')){
                contador++;
            }
        }
        
        System.out.println("Tiene "+contador+" digitos.");
        
    }
}

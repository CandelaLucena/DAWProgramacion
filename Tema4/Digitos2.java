public class Digitos2 {
    public static void main(String[] args) {
        String letraNumero = "un 1, un 20 y un 234 ";
        int contador = 0;
        char[] array = letraNumero.toCharArray();

        for (int i = 0; i < array.length; i++) {
            
            if((array[i]>='0')&&(array[i]<='9')){
                if(!((array[i+1]>='0')&&(array[i+1]<='9'))){
                    contador++;
                }
            }
            
        }
        
        System.out.println("Tiene "+contador+" numeros.");
    }
}

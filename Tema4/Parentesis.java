public class Parentesis {
    public static void main(String[] args) {
        String letraNumero = "ho()la";
        char[] array = letraNumero.toCharArray();
        int contador = 0;

        for (int i = 0; i < array.length; i++) {

            if(array[i]=='('){
                contador++;
            }else if(array[i]==')'){
                contador--;
            }

        }

        if (contador == 0){
            System.out.println("Está bien parentizada.");
        }else{
            System.out.println("No está bien parentizada.");
        }
        
    }
}

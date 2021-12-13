public class Comparar2 {
    public static void main(String[] args) {
        
        String cadena1 = "CadEnAuno";
        String cadena2 = "CAdenaDos";
    
        int comparacion1 = cadena1.compareToIgnoreCase(cadena2);
        System.out.println(comparacion1);
        int comparacion2 = cadena2.compareToIgnoreCase(cadena1);
        System.out.println(comparacion2);
        if(comparacion1>comparacion2){
            System.out.println("Cadena 1 es mayor que cadena 2");
        }else{
            System.out.println("Cadena 2 es mayor que cadena 1");
        }
        
    }
}

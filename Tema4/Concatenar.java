public class Concatenar {
    public static void main(String[] args) {
        String cadena1 = "Hola. ";
        String cadena2 = "Buenos días, ";
        String cadena3 = "¿cómo está?";

        String cadena4 = cadena1.concat(cadena2);
        String cadena5 = cadena4.concat(cadena3);

        System.out.println(cadena5);
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio8EstadisticasTexto {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new File("DAWProgramacion/Tema7/fichero5.txt"));
        int contadorLetras = 0;
        int contadorPalabras = 0;
        int contadorLineas = 1;
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        int contarLetraPalabra = 0;
        int contadorEspacios = 0;
        int contadorTabulacion = 0;

        do{
            String palabra = scanner1.next();
            contarLetraPalabra = (int) palabra.chars().count();
            for (int index = 0; index < palabra.length(); index++) {
                char letra= palabra.charAt(index);
                if(letra == 'a'|| letra == 'e'|| letra == 'i' ||letra == 'o' ||letra == 'u'||letra == 'á' ||letra == 'é' ||letra == 'í' 
                 ||letra == 'ó' ||letra == 'ú'){
                    contadorVocales++;
                    
                }else{
                    contadorConsonantes++;
                }
            }
            contadorLetras = contarLetraPalabra + contadorLetras;
            contadorPalabras++;
        }while (scanner1.hasNext());

        do{
            contadorLineas++;
        }while(scanner1.hasNextLine());

        System.out.println("Letras: "+contadorLetras);
        System.out.println("Palabras: "+contadorPalabras);
        System.out.println("Lineas: "+contadorLineas);
        System.out.println("Vocales: "+contadorVocales);
        System.out.println("Consonantes: "+contadorConsonantes);
        System.out.println("Espacios: "+contadorEspacios);
        System.out.println("Tabulaciones: "+contadorTabulacion);
    }
}

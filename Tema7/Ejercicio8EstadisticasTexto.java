import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio8EstadisticasTexto {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new File("DAWProgramacion/Tema7/fichero5.txt"));
        int contadorLetras = 0;
        int contadorPalabras = 0;
        int contadorLineas = 0;
        int contadorVocales = 0;
        int contadorConsonantes = 0;

        do{
            if(scanner1.hasNext() == true){
                scanner1.next();
            }else{
                scanner1.next();
            }
        }while (scanner1.hasNext());
    }
}

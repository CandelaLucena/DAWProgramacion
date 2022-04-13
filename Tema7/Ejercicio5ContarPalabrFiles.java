import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5ContarPalabrFiles {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new File("DAWProgramacion/Tema7/fichero4.txt"));
        ArrayList<String> leerfichero1 = new ArrayList<String>();
        while (scanner1.hasNext()){
            leerfichero1.add(scanner1.next());
        }
        scanner1.close();


        
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio5ContarPalabrFiles {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new File("DAWProgramacion/Tema7/fichero4.txt"));
        String patron = "";
        int contador = 0;
        System.out.println("Escriba el patron");
        Scanner scanner2 = new Scanner(System.in);
        patron = scanner2.nextLine();
        scanner2.close();

        while (scanner1.hasNext()){
            if(scanner1.hasNext(patron)){
                contador++;
            }else{

            }
        }
        scanner1.close();
        System.out.println(contador);
        

        
    }
}

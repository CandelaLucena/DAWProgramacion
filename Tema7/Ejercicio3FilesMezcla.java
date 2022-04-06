import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3FilesMezcla {
    public static void main(String[] args) throws FileNotFoundException {
        int contador = 0;
        Scanner scanner1 = new Scanner(new File("DAWProgramacion/Tema7/fichero1.txt"));
        ArrayList<String> leerfichero1 = new ArrayList<String>();
        while (scanner1.hasNext()){
            leerfichero1.add(scanner1.next());
        }
        scanner1.close();

        Scanner scanner2 = new Scanner(new File("DAWProgramacion/Tema7/fichero2.txt"));
        ArrayList<String> leerfichero2 = new ArrayList<String>();
        while (scanner2.hasNext()){
            leerfichero2.add(scanner2.next());
        }
        scanner2.close();

        //for (String item : leerfichero1) {
        //    System.out.println(item);
        //}
        //for (String item : leerfichero2) {
        //    System.out.println(item);
        //}

        do{
            if(leerfichero1.size()>contador){
                System.out.println(leerfichero1.get(contador));
            }
            if(leerfichero2.size()>contador){
                System.out.println(leerfichero2.get(contador));
            }
            contador++;
        }while(!(leerfichero1.size()<contador&&leerfichero2.size()<contador));
    }
}

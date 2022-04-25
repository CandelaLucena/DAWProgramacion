import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3FilesMezcla {
    public static void main(String[] args) throws FileNotFoundException {
        int contador = 0;
        Scanner scanner1 = new Scanner(new File("DAWProgramacion/Tema7/fichero1.txt"));
        ArrayList<String> leerFichero1 = new ArrayList<String>();
        while (scanner1.hasNext()){
            leerFichero1.add(scanner1.next());
        }
        scanner1.close();

        Scanner scanner2 = new Scanner(new File("DAWProgramacion/Tema7/fichero2.txt"));
        ArrayList<String> leerFichero2 = new ArrayList<String>();
        while (scanner2.hasNext()){
            leerFichero2.add(scanner2.next());
        }
        scanner2.close();

        //for (String item : leerfichero1) {
        //    System.out.println(item);
        //}
        //for (String item : leerfichero2) {
        //    System.out.println(item);
        //}
        
        PrintStream o = new PrintStream(new File("/home/INFORMATICA/alu11063022/Escriptori/Repositorios/DAWProgramacion/Tema7/fichero3.txt"));
        System.setOut(o);

        do{
            if(leerFichero1.size()>contador){
                System.out.println(leerFichero1.get(contador));
            }
            if(leerFichero2.size()>contador){
                System.out.println(leerFichero2.get(contador));
            }
            contador++;
        }while(!(leerFichero1.size()<contador&&leerFichero2.size()<contador));
    }
}

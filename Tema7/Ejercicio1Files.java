import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1Files {

    public static void main(String[] args) throws IOException {
        int contador = 0;

        //Abre el directorio root
        File files1 = File.listRoots()[0];
        System.out.println("Lista de ficheros y directorios del directorio root: "+ File.listRoots()[0]);
        System.out.println("---------------------------------------------------");

        //recorre la lista de ficheros (recordad que un directorio es un tipo especial de fichero)
        for (String e : files1.list()){
            System.out.println(contador+". "+e);
            contador++;
        }

        System.out.println("Introduce un directorio:");
        String ent = new BufferedReader(new InputStreamReader(System.in)).readLine();

        if(ent.equals("0")){
        }else{
            File files2 = new File(ent);

            System.out.println("Lista de ficheros y directorios del directorio: " + ent);
            System.out.println("---------------------------------------------------");
            for (String e : files2.list()) {
                System.out.println(e);
            }
        }
    }

}
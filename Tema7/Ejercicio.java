import java.io.File;

public class Ejercicio {

    public static void main(String[] args) {

        //Abre el directorio root

        File f = new File(File.listRoots()[0]);

        System.out.println("Lista de ficheros y directorios del directorio root: "+ File.listRoots() [0]);

        System.out.println("---------------------------------------------------");

        //recorre la lista de ficheros (recordad que un directorio es un tipo especial de fichero)

        for (String e : f.list()){

            System.out.println(e);

        }
        
        DateFormat formatter;

        formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());

        //....

        System.out.println(cont + ".- \t" + flags + "\t" +  String.format("%-15d", e.length()) + formatter.format(e.lastModified()) + "\t" + e.getName());
    }

}
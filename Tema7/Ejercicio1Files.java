import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1Files {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File actualFile = File.listRoots()[0];
        int id = 0;
        int listIDFiles;

        System.out.println("Lista de ficheros y directorios del directorio root: "+ actualFile.getName());
        System.out.println("---------------------------------------------------");
        for (String e : actualFile.list()){
            System.out.println(id+".- "+e);
            id++;
        }

        do{
            id = 0;
            System.out.println("Introduce un directorio:");
            listIDFiles = scanner.nextInt();
            if(listIDFiles == 0){
            }else{
                actualFile = File.listRoots()[listIDFiles];
                for (String e : actualFile.list()){
                    System.out.println(id+".- "+e);
                    id++;
                }
            }
        }while(!(listIDFiles == -1));
        scanner.close();
    }
}
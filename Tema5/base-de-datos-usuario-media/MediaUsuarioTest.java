import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MediaUsuarioTest {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Candela@gmail.com", "hola");
        //Usuario usuario2 = new Usuario("Mario@gmail.com", "hola1");
        //Usuario usuario3 = new Usuario("Luis@gmail.com", "hola2");

        ArrayList<FileWriter> filexml = new ArrayList<FileWriter>();


        try{
            FileWriter myWriter = new FileWriter("/home/INFORMATICA/alu11063022/Escriptori/carpeta nova/file.txt");
            myWriter.write(usuario1.generateXML());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }
}

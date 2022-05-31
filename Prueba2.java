import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Prueba2 {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("./Texto.txt");
        BufferedReader breader = new BufferedReader(reader);

        String linea=breader.readLine();

        System.out.println(linea);
        
        

    }
}

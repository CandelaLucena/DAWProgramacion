import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Prueba {
    public static void main(String[] args) throws IOException {
        //Cosa que quiero escribir
        String texto="Hola Mundo";

        //Escritores
        FileWriter writer= new FileWriter("./Texto.txt");      
        BufferedWriter bWriter = new BufferedWriter(writer);

        bWriter.write(texto);
        bWriter.close();
        
        

    }
}

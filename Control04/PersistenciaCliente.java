import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class PersistenciaCliente {
    
    public void write(ArrayList<Cliente> clientes) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("DAWProgramacion/Control04/clientes.dat"));
        PrintStream o = new PrintStream(new File("DAWProgramacion/Control04/clientes.dat"));
        System.setOut(o);
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(i);
        }
        
    }
    public void read() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("DAWProgramacion/Control04/clientes.dat"));
    }
}

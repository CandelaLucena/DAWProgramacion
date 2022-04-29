import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersistenciaCliente {
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public void write(ArrayList<Cliente> clientes) throws FileNotFoundException{
        Scanner scanner1 = new Scanner(new File("DAWProgramacion/Control04/clientes.dat"));
    }
    public void read() throws FileNotFoundException{
        Scanner scanner1 = new Scanner(new File("DAWProgramacion/Control04/clientes.dat"));
    }
}

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CrearObjetoCliente {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("DAWProgramacion/Control04/clientes.dat"));

        String[] id = {"01","02","03"};
        String[] nif = {"12345678L", "23456789O", "34567891P"};
        String[] nombre = {"Candela", "Maria", "Alberto"};
        String[] apellido = {"Lucena", "Reyes", "Mendoza"};
        String[] email = {"cande@gmail", "ria@gmail", "albert@gmail"};

        Cliente e;
    }
}

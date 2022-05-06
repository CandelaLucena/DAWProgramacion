import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerObjetoCliente {
    public static void main(String[] args) throws IOException, ClassCastException, ClassNotFoundException {

        ObjectInputStream file = new ObjectInputStream(new FileInputStream("DAWProgramacion/Control04 copy/clientes.dat"));
        Cliente e;

        try{
            while(true) {
                e = (Cliente) file.readObject();
                System.out.println("ID: "+ e.getId());
                System.out.println("NIF: "+ e.getNif());
                System.out.println("Nombre: "+ e.getNombre());
                System.out.println("Apellidos: "+ e.getApellidos());
                System.out.println("Email: "+ e.getEmail());
                System.out.println();
            }
        }catch (EOFException eof){
            file.close();
        }
    }
}

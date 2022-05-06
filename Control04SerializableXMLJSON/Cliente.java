import java.util.ArrayList;

public class Cliente extends Persona {

    private static final long serialVersionUID = 1L;

    private String id;
    private String email;
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public Cliente(String id, String email, String nif, String nombre, String apellidos) {
        super(nif, nombre, apellidos);
        this.id = id;
        this.email = email;
        clientes.add(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "nif:\t"+ nif+
               "nombre:\t"+  nombre+
               "apellidos:\t"+  apellidos+
               "id:\t"+  id+
               "email:\t"+ email;
    }
}

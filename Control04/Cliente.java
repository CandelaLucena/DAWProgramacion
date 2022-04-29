public class Cliente extends Persona{
    private int id;
    private String email;

    public Cliente(int id, String email, String nif, String nombre, String apellidos) {
        this.id = id;
        this.email = email;
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        //clientes.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id                  "+id+
               "Nif                 "+nif+
               "Nombre              "+nombre+
               "Apellidos           "+apellidos+
               "Email               "+email;
    }

    
    
}

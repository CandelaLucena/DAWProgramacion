import java.util.ArrayList;

public class Usuario {
    private int id; //unico clave principal
    private String email; //unico
    private String password;

    
    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private static int idGenerator = 0;
    
    public Usuario(int id, String email, String password) {

        this.id = idGenerator++;
        this.password = password;

        if(this.esValidoEmail(email)){
            this.email = email;
            usuarios.add(this);
        }else{
            this.id = -1;
            this.email = "Correo duplicado; " + email;
        }
    }

    private boolean esValidoEmail(String email){
        boolean resultado = true;

        for (Usuario usuario : usuarios){
            if(email.equals(usuario.getEmail())){
                resultado = false;
                break;
            }
        }
        return resultado;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void eliminarUsuario(String email){
        for (Usuario item : usuarios){
            if(email.equals(item.getEmail())){
                usuarios.remove(item);
            }
        }
    }
}

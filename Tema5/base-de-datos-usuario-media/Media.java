import java.util.ArrayList;

public class Media {
    private int id; //unico clave principal
    private String nombre; //unico
    private String contenido;
    private String tipo;
    private int usuario_id; //unico, clave externa a id de Usuario

    private static ArrayList<Media> media = new ArrayList<Media>();
    
    public Media(int id, String nombre, String contenido, String tipo, int usuario_id) {
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario_id = usuario_id;
        media.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }
}

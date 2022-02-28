import java.util.ArrayList;
import java.util.Iterator;

public class Media {
    private int id; //unico clave principal
    private String nombre; //unico
    private String contenido;
    private MediaType tipo;
    private Usuario usuario_id; //unico, clave externa a id de Usuario

    private static ArrayList<Media> media = new ArrayList<Media>();
    private static int idGenerador = 0;
    
    public Media(String nombre, String contenido, MediaType tipo, Usuario usuario_id) {
        this.id = idGenerador++;
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario_id = usuario_id;

        if(this.esValidoNombre(nombre)){
            this.nombre = nombre;
            media.add(this);
        }else{
            this.id = -1;
            this.nombre = "Nombre duplicado; " + nombre;
        }

    }

    private boolean esValidoNombre(String nombre){
        boolean resultado = true;

        for (Media item : media){
            if(nombre.equals(item.getNombre())){
                resultado = false;
                break;
            }
        }
        return resultado;
    }

    public int getId() {
        return id;
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

    public MediaType getTipo() {
        return tipo;
    }

    public void setTipo(MediaType tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }

    public static void eliminarMediaPorNombre(String nombre){
        for (Media item : media){
            if(nombre.equals(item.getNombre())){
                media.remove(item);
                break;
            }
        }
    }

    public static void eliminarMediaCompleta(MediaType tipo){
        Iterator <Media> iter = media.iterator();
        while (iter.hasNext()){
            Media item = iter.next();
            if(tipo.equals(item.getTipo())){
                iter.remove();
            }          
        }
    }

    //Iterator <Usuario> iter = media.iterator();
    //while (iter.hasNext()){
    //      Usuario str = iter.next();
    //      if(condition){
    //              iter.remove();
    //      }          
    //}

    public void mediaGenerateXML(){
        String generateXML = "";

        generateXML += "<media>";
        generateXML += "<id>" + getId() + "</id>";
        generateXML += "<nombre>" + getNombre() + "</nombre>";
        generateXML += "<contenido>" + getContenido() + "</contenido>";
        generateXML += "<tipo>" + getTipo() + "</tipo>";
        generateXML += "<usuario_id>" + getUsuario_id() + "</usuario_id>";
        generateXML += "</media>";
        
        System.out.println(generateXML);
    }
}

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Media implements ParserXML{
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
    
    public static void eliminarTodoPorUserID (int id){
        Iterator<Media> iter = media.iterator();
        while(iter.hasNext()){
            Media media = iter.next();
            if(media.getUsuario_id().getId() == id){
                iter.remove();
            }
        }
    }

    public String generateXML(){
        String XML = "";

        XML += "<media>\n";
        XML += "<id>" + id + "</id>\n";
        XML += "<nombre>" + nombre + "</nombre>\n";
        XML += "<contenido>" + contenido + "</contenido>\n";
        XML += "<tipo>" + tipo + "</tipo>\n";
        XML += "<usuario_id>" + usuario_id + "</usuario_id>\n";
        XML += "</media>\n";
        
        return XML;
    }

    public void ficheroXML(Media media){
        try{
            FileWriter myWriter = new FileWriter("/home/INFORMATICA/alu11063022/Escriptori/Repositorios/DAWProgramacion/Tema5/base-de-datos-usuario-media/usuarios/mediasficheroMedia.txt", true);
            myWriter.write(media.generateXML());
            myWriter.write(" \n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

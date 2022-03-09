//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
 
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Usuario implements ParserXML{
    private int id; //unico clave principal
    private String email; //unico
    private String password;

    
    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private static int idGenerator = 0;
    
    public Usuario(String email, String password) {

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
                break;
            }
        }
    }

    public static void eliminarUsuarioPorDominio(String dominio){
        Iterator<Usuario> iter = usuarios.iterator();
        while(iter.hasNext()){
            Usuario usuarios = iter.next();
            if(usuarios.email.endsWith(dominio)){
                iter.remove();
            }
        }
    }

    public String generateXML(){
        String XML = "";

        XML += "<usuario>\n";
        XML += "<id>" + id + "</id>\n";
        XML += "<email>" + email + "</email>\n";
        XML += "<password>" + password + "</password>\n";
        XML += "</usuario>\n";
        
        return XML;
    }

    public void ficheroXML(Usuario usuario){
        try{
            FileWriter myWriter = new FileWriter("DAWProgramacion/Tema5/base-de-datos-usuario-media/usuarios/"+id+email+".xml");
            myWriter.write(usuario.generateXML());
            myWriter.write(" \n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //public static void leerFicheroXML(String archivo){
    //    try{
    //        FileReader fr=new FileReader("/home/INFORMATICA/alu11063022/Escriptori/Repositorios/DAWProgramacion/Tema5/base-de-datos-usuario-media/usuarios/"+archivo+".xml");
    //        fr.close();
    //    }catch(IOException e){
    //        System.out.println("An error occurred.");
    //        e.printStackTrace();
    //    }
    //}

    public static void leerFicheroXMLYCrearUsuario(String archivo) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse("DAWProgramacion/Tema5/base-de-datos-usuario-media/usuarios/" + archivo);
        XPathFactory xpathfactory = XPathFactory.newInstance();
        XPath xpath = xpathfactory.newXPath();
        String resultadoEmail = "";
        String resultadoPassword = "";


        XPathExpression expr = xpath.compile("//email/text()");
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        NodeList nodes = (NodeList) result;
        for (int i = 0; i < nodes.getLength(); i++) {
            resultadoEmail = nodes.item(i).getNodeValue();
        }
        

        expr = xpath.compile("//password/text()");
        result = expr.evaluate(doc, XPathConstants.NODESET);
        nodes = (NodeList) result;
        for (int i = 0; i < nodes.getLength(); i++) {
            resultadoPassword = nodes.item(i).getNodeValue();
        }

        Usuario usuario = new Usuario(resultadoEmail, resultadoPassword);
        usuario.ficheroXML(usuario);
    }
}

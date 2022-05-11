import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.xml.crypto.dsig.TransformException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CrearXML {
    public static void main(String[] args) 
        throws IOException, ClassNotFoundException, ParserConfigurationException, TransformException, TransformerFactoryConfigurationError, TransformerException {
    
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("DAWProgramacion/Control04SerializableXMLJSON/clientes.dat"));
        
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element clientes = doc.createElement("clientes");
        doc.appendChild(clientes);

        Cliente e;
        try{
            while(true){
                e = (Cliente) file.readObject();

                Element cliente = doc.createElement("cliente");
                //emp.setAttribute("numero", String.substring(e.getId())); ATRIBUTO
                clientes.appendChild(cliente);
                
                Element hijo = doc.createElement("id");
                hijo.appendChild(doc.createTextNode(e.getId()));
                cliente.appendChild(hijo);

                Element hijo1 = doc.createElement("nif");
                hijo1.appendChild(doc.createTextNode(e.getNif()));
                cliente.appendChild(hijo1);

                Element hijo2 = doc.createElement("nombre");
                hijo2.appendChild(doc.createTextNode(e.getNombre()));
                cliente.appendChild(hijo2);

                Element hijo3 = doc.createElement("apellido");
                hijo3.appendChild(doc.createTextNode(e.getApellidos()));
                cliente.appendChild(hijo3);

                Element hijo4 = doc.createElement("email");
                hijo4.appendChild(doc.createTextNode(e.getEmail()));
                cliente.appendChild(hijo4);

                
            }
        } catch (EOFException eof) {
            file.close();
        }
        Transformer trans = TransformerFactory.newInstance().newTransformer();

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream("DAWProgramacion/Control04SerializableXMLJSON/generar.xml"));
        trans.transform(source, result);
    }
}

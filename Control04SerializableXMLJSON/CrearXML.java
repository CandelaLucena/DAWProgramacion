import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.xml.crypto.dsig.TransformException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class CrearXML {
    public static void main(String[] args) 
        throws IOException, ClassNotFoundException, ParserConfigurationException, TransformException {
    
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("DAWProgramacion/Control04SerializableXMLJSON/clientes.xml"));
        
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = doc.createElement("clientes");
        doc.appendChild(root);

        Cliente e;
        try{
            while(true){
                e = (Cliente) file.readObject();

                Element emp = doc.createElement("cliente");
                emp.setAttribute("numero", String.toString(e.getId()));

                Element hijo = doc.createElement("nombre");
                hijo.appendChild(doc.createTextNode(e.getNombre()));
                emp.appendChild(hijo);


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

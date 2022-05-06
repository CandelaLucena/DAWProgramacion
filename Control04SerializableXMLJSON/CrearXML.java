import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.xml.crypto.dsig.TransformException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class CrearXML {
    public static void main(String[] args) 
        throws IOException, ClassNotFoundException, ParserConfigurationException, TransformException {
    
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("DAWProgramacion/Control04SerializableXMLJSON/generar.xml"));
        
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = doc.createElement("clientes");
        doc.appendChild(root);

        Cliente e;
        try{
            while(true){
                e = (Cliente) file.readObject();
                Element emp = doc.createElement("cliente");
                emp.setAttribute();
            }
        }
    }
}

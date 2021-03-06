import java.io.FileNotFoundException;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import org.w3c.dom.Element;

import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

public class LeerXML2 {

    public static void main(String[] args)

            throws ParserConfigurationException, 

                    FileNotFoundException, 

                    IOException, 

                    SAXException {

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("DAWProgramacion/Control04SerializableXMLJSON/clientes.xml");

        Element root = doc.getDocumentElement(); // apuntarà al elemento raíz

        NodeList hijos = root.getChildNodes();

        System.out.println(hijos.item(0).getNodeName()); // el primer hijo es el retorno de carro.

        System.out.println(hijos.item(1).getNodeName()); // el segundo hijo sí que és vehiculo

        System.out.println(hijos.item(2).getNodeName()); // el tercer hijo es el retorno de carro.

        System.out.println(hijos.item(3).getNodeName()); // el cuarto hijo sí que és vehiculo

        System.out.println(hijos.item(4).getNodeName()); // el quinto hijo es el retorno de carro.

        System.out.println(hijos.item(5).getNodeName()); // no existe el sexto hijo. Dará error

    }

}


package EjemploDOM;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import java.io.File;

public class LeerXMLconDOM {

    /*
     * Este ejercicio es copiado del documento AD_XML_DOM_SAX_v2, página 12
     */

    public static void main(String[] args) {
        try {
            // Crear una instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Crear un objeo DocumentBuilder a partir de la fábrica
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parsear el archivo XML y obtener el documento
            File file = new File("ArchivoAleer.xml");
            Document doc = (Document) builder.parse(file);

            // Obtener la lista de nodos con el nombre "elemento"
            NodeList nodeList = doc.getElementsByTagName("elemento");

            // Iterar a través de los nodos y mostrar la información
            for (int i = 0; i<nodeList.getLength();i++){
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element elemento = (Element) node;

                    // Obtener el contenido de los elementos dentro de "elemento"
                    String atributo = elemento.getAttribute("atributo");
                    String contenido = elemento.getElementsByTagName("contenido").item(0).getTextContent();

                    // Mostrar la informacion
                    System.out.println("Atributo: "+atributo);
                    System.out.println("Contenido: "+contenido);
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

/* Este programa asume que tienes un archivo XML llamado "archivo.xml" con una estructura similar a la siguiente:

<raiz>
    <elemento atributo="valor1">
        <contenido>Texto1</contenido>
    </elemento>
    <elemento atributo="valor2">
        <contenido>Texto2</contenido>
    </elemento>
</raiz
 */

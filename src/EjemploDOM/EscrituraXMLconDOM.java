package EjemploDOM;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class EscrituraXMLconDOM {
    /**
     * Este ejercicio es copiado del documento AD_XML_DOM_SAX_v2, pagina 12
     */

    public static void main(String[] args) {
        try {
            // Crear una instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Crear un DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Crear un documento XML
            Document doc = builder.newDocument();

            // Crear el elemento raiz
            Element root = doc.createElement("Libros");
            doc.appendChild(root);

            // Crear un elemento de libro
            Element libro = doc.createElement("Libro");
            root.appendChild(libro);

            // Crear elementos para el titulo y el autor
            Element titulo = doc.createElement("Titulo");
            Text tituloText = doc.createTextNode("El Gran Gatsby");
            titulo.appendChild(tituloText);
            libro.appendChild(titulo);

            Element autor = doc.createElement("Autor");
            Text autorText = doc.createTextNode("F. Scott Fitzgerald");
            autor.appendChild(autorText);
            libro.appendChild(autor);

            // Guardar el documento en un archivo
            javax.xml.transform.TransformerFactory.newInstance().newTransformer().transform(new javax.xml.transform.dom.DOMSource(doc), new javax.xml.transform.stream.StreamResult(new java.io.File("biblioteca.xml")));

        }catch (ParserConfigurationException | javax.xml.transform.TransformerException e){
            System.out.println(e);
        }
        }
    }

    /*
    El fichero generado es el siguiente:
    <?xml version="1.0" encoding="UTF-8" standalone="no"?>
    <Libros>
        <Titulo>El Gran Gatsby</Titulo>
        <Autor>F. Scott Fitzgerald</Autor>
    <Libro>
     */

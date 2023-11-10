package Ejercicios_DTD;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document; import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

public class Ejercicio3_DTD {
    public static void main(String[] args){

        try {
            DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
            factory.setValidating(true);
            factory.setNamespaceAware(true);

            DocumentBuilder builder = factory.newDocumentBuilder();

            builder.setErrorHandler(new SimpleErrorHandler());

            Document document = builder.parse(new File("C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos_Clase\\src\\XML\\XML_FCBARCELONA.xml"));

            System.out.println("El documento XML es válido con el DTD.");

        }catch (Exception e){
            System.out.println("Error de validación: " + e.getMessage());
        }



    }




}

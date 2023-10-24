package Ejercicios_ManejoFicheros.FormasDeAcessoAunFichero;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {
        try {
            // CREAMOS UN FILEWRITER Y LE PONEMOS NOMBRE AL FICHERO
            FileWriter fichero = new FileWriter("FichTexto.txt");

            // ESCRIBIMOS EL CONTENIDO DEL FICHERO
            fichero.write("Esto es texto escrito en un fichero de texto");

            // Cerramos el fichero
            fichero.close();

        } catch (IOException e) {
            // Capturamos la excepción
            System.out.println(e.getMessage());
        }

    }
}

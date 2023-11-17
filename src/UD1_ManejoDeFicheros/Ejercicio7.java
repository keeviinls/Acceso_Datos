package UD1_ManejoDeFicheros;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio7 {
    public static void main(String[] args) {

        // Creamos un String con la ruta del primer fichero que queramos copiar
        String ruta_fichero= "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR\\FICHERO1.txt" ;

        //Creamos un fichero nuevo con la ruta del primer fichero.
        File fichero1 = new File(ruta_fichero);


        //Hacemos los mismo que arriba pero cambiando el nombre para el segundo fichero
        String ruta_fichero2= "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR\\FICHERO2.txt" ;
        File fichero2 = new File(ruta_fichero2);

        //TAMBIEN PODEMOS COPIARLO EN UNA CARPETA SUPERIOR, EN ESTE CASO SE LLAMARIA "Acceso_Datos", seria poner la ruta hasta ahi y ya funcionaria

        //Creamos un File de destino, aqui guardaremos el destino donde querramos
        // que se guarde nuestras copias de los 2 ficheros.

        //TAMBIEN PODEMOS COPIARLO EN UNA CARPETA SUPERIOR,
        // EN ESTE CASO SE LLAMARIA "Acceso_Datos", seria poner la ruta hasta ahi y ya funcionaria

        String ruta_directorio= "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR\\Directorio_dentro" ;
        File destino = new File(ruta_directorio);



        try {

            /* Con la funcion "FileUtils.copyFileToDirectory", podremos copiar el fichero y moverlo a un directorio
            * dentro indicamos el nombre del fichero que queremos copiar (fichero1), y el directorio donde se copiara (destino)
             */
            FileUtils.copyFileToDirectory(fichero1, destino);
            System.out.println("Fichero "+fichero1.getName()+ " copiado");

            // Hacemos lo mismo pero esta vez con el fichero 2

            FileUtils.copyFileToDirectory(fichero2, destino);
            System.out.println("Fichero "+fichero2.getName() + " copiado");
        }

        catch (IOException e){
            System.err.println("Error al copiar el archivo");
            e.printStackTrace();
        }
    }
}

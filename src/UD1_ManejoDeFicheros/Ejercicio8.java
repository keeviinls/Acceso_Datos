package UD1_ManejoDeFicheros;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {

        // Creamos un String con la ruta del primer fichero que queramos mover
        String ruta_fichero= "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR\\FICHERO1.txt" ;

        //Creamos un fichero nuevo con la ruta del primer fichero.
        File fichero1 = new File(ruta_fichero);

        //Hacemos los mismo que arriba pero cambiando el nombre para el segundo fichero
        String ruta_fichero2= "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR\\FICHERO2.txt" ;
        File fichero2 = new File(ruta_fichero2);




        //Creamos un File de destino, aqui es donde se moveran los ficheros indicados.

        //TAMBIEN PODEMOS MOVERLO EN UNA CARPETA SUPERIOR,
        // EN ESTE CASO SE LLAMARIA "Acceso_Datos", seria poner la ruta hasta ahi y ya funcionaria

        String ruta_directorio= "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\Directorio_dentro" ;
        File destino = new File(ruta_directorio);

        try {

            /* Con la funcion "moveFileToDirectory", podremos seleccionar el fichero y moverlo a un directorio
            * dentro indicamos el nombre del fichero que queremos copiar (fichero1),el directorio donde se copiara (destino),
            * y luego "true", para permitir el transporte.
            * */
            FileUtils.moveFileToDirectory(fichero1,destino,true);
            System.out.println("El fichero "+fichero1.getName()+ " ha sido movido a "+destino.getName());

            // Hacemos lo mismo pero esta vez con el fichero 2
            FileUtils.moveFileToDirectory(fichero2,destino,true);
            System.out.println("El fichero "+fichero2.getName()+ " ha sido movido a "+destino.getName());

        }catch (IOException e){
            System.err.println("Error al mover el archivo");
            e.printStackTrace();
        }
    }
}

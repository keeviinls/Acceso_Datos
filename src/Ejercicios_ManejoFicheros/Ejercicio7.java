package Ejercicios_ManejoFicheros;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio7 {
    public static void main(String[] args) {

        String ruta_fichero= "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR\\FICHERO1.txt" ;
        File fichero1 = new File(ruta_fichero);

        String ruta_fichero2= "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR\\FICHERO2.txt" ;
        File fichero2 = new File(ruta_fichero2);

        //TAMBIEN PODEMOS COPIARLO EN UNA CARPETA SUPERIOR, EN ESTE CASO SE LLAMARIA "Acceso_Datos", seria poner la ruta hasta ahi y ya funcionaria
        String ruta_directorio= "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR" ;
        File destino = new File(ruta_directorio);



        try {
            FileUtils.copyFileToDirectory(fichero1, destino);
            System.out.println("Fichero "+fichero1.getName()+ " copiado");

            FileUtils.copyFileToDirectory(fichero2, destino);
            System.out.println("Fichero "+fichero2.getName() + " copiado");
        }

        catch (IOException e){
            System.err.println("Error al copiar el archivo");
            e.printStackTrace();
        }


    }
}

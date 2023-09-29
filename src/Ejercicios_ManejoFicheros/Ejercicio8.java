package Ejercicios_ManejoFicheros;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {
        String ruta_fichero= "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR\\FICHERO1.txt" ;
        File fichero1 = new File(ruta_fichero);

        String ruta_fichero2= "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR\\FICHERO2.txt" ;
        File fichero2 = new File(ruta_fichero2);

        //TAMBIEN PODEMOS COPIARLO EN UNA CARPETA SUPERIOR, EN ESTE CASO SE LLAMARIA "Acceso_Datos", seria poner la ruta hasta ahi y ya funcionaria
        String ruta_directorio= "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos" ;
        File destino = new File(ruta_directorio);

        try {
            FileUtils.moveFileToDirectory(fichero1,destino,true);
            System.out.println("El fichero "+fichero1.getName()+ " ha sido movido a "+destino.getName());

            FileUtils.moveFileToDirectory(fichero2,destino,true);
            System.out.println("El fichero "+fichero2.getName()+ " ha sido movido a "+destino.getName());

        }catch (IOException e){
            System.err.println("Error al mover el archivo");
            e.printStackTrace();
        }
    }
}

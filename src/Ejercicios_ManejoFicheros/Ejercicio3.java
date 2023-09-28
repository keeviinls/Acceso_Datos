package Ejercicios_ManejoFicheros;

import java.io.File;

public class Ejercicio3 {

    public static void main(String[] args) {

        String ruta_completa = "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR" ;
        File fichero1 = new File(ruta_completa);

        // Verificar si la ruta es una carpeta válida
        if (fichero1.isDirectory()) {
            // Obtener la lista de archivos en la carpeta
            File[] files = fichero1.listFiles();

            // Verificar si la lista de archivos no es nula
            if (files != null) {
                // Obtener el número de archivos en la carpeta
                int numberOfFiles = files.length;
                System.out.println("Número de archivos en la carpeta: " + numberOfFiles);
            } else {
                System.err.println("No se pudo obtener la lista de archivos.");
            }
        } else {
            System.err.println("La ruta especificada no es una carpeta válida.");
        }
    }
}

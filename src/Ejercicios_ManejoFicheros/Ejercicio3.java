package Ejercicios_ManejoFicheros;

import java.io.File;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Creamos la ruta de nuestros ficheros y directorios.

        String ruta_completa = "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR" ;
        File fichero1 = new File(ruta_completa);   //CREAMOS EL FICHERO 1 CON LA RUTA AÑADIDA ANTERIORMENTE

        // Comprobamos si el directorio indicado en la ruta existe
        if (fichero1.isDirectory()) {
            //  //Creamos un array que almacenara los nombres del listado del directorio
            File[] listado = fichero1.listFiles();
            int contador = 0;

            // Verificar si la lista de archivos no es nula Comprobamos si el array del listado es Nulo o no
            if (listado != null) {
                // En este bucle vamos recorriendo cada objeto del listado
                for (int i = 0; i < listado.length; i++) {

                    // Ahora con el IF indicamos que sume 1 al contador cada vez que encuentre dentro
                    // del listado un objeto de fichero o directorio
                    if (listado[i].isFile() || listado[i].isDirectory()) {
                        contador++;
                    }
                }
                System.out.println("Ficheros en el directorio actual "+contador);
            }
                else {
                System.err.println("No se pudo obtener la lista de archivos.");
            }
        } else {
            System.err.println("La ruta especificada no es una carpeta válida.");
        }
    }
}

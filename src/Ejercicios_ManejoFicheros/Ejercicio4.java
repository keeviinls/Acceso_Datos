package Ejercicios_ManejoFicheros;

import java.io.File;

public class Ejercicio4 {
    public static void main(String[] args) {

        /* Tambien si queremos usar un directorio ya creado, podemos hacerlo creando la ruta del directorio completa
        y luego en fichero1 añadimos esa ruta, debajo hay un ejemplo con el directorio ya creado "NUEVODIR"
        String ruta_completa = "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR" ;*/

        File fichero1 = new File(".");    //CCREAMOS EL DIRECTORIO CON LA RUTA AÑADIDA ANTERIORMENTE

        if (fichero1.exists()){         //AQUI VERIFICAMOS SI EL DIRECTORIO  EXISTE

            // El nombre del archivo o carpeta
            System.out.println("Nombre del fichero: "+fichero1.getName() );

            // Obtiene la ruta del fichero, el inicio es el punto de ejecución del programa
            System.out.println("Ruta: "+fichero1.getPath());

            // Obtiene la ruta completa desde la raíz del sistema al fichero
            System.out.println("Ruta absoluta: "+fichero1.getAbsolutePath());

            // Devuelve true o false, dependiendo si se puede o no leer
            System.out.println("Se puede leer: "+fichero1.canRead());

            // Devuelve true o false, dependiendo si se puede o no escribir
            System.out.println("Se puede escribir: "+fichero1.canWrite());

            // El tamaño del archivo en bytes. Si no existe o no tienes permiso devuelve un 0.
            System.out.println("Tamaño: "+fichero1.length());

            // Indica si el objeto actual representa a una carpeta o no
            System.out.println("Es un directorio: "+fichero1.isDirectory());

            // Indica si el objeto actual representa a un archivo
            System.out.println("Es un fichero: "+fichero1.isFile());

            // Obtiene el nombre del directorio padre
            System.out.println("Nombre del directorio padre: "+fichero1.getParent());

        }

        else {
            System.out.println("Ese directorio o fichero no existe");
        }


    }
}

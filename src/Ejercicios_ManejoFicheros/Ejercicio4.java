package Ejercicios_ManejoFicheros;

import java.io.File;

public class Ejercicio4 {
    public static void main(String[] args) {

        /* Tambien si queremos usar un directorio ya creado, podemos hacerlo creando la ruta del directorio completa
        y luego en fichero1 añadimos esa ruta, debajo hay un ejemplo con el directorio ya creado "NUEVODIR"
        String ruta_completa = "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR" ;*/

        File fichero1 = new File(".");    //CCREAMOS EL DIRECTORIO CON LA RUTA AÑADIDA ANTERIORMENTE

        if (fichero1.exists()){         //AQUI VERIFICAMOS SI EL DIRECTORIO  EXISTE

            System.out.println("Nombre del fichero: "+fichero1.getName() );
            System.out.println("Ruta: "+fichero1.getPath());
            System.out.println("Ruta absoluta: "+fichero1.getAbsolutePath());
            System.out.println("Se puede leer: "+fichero1.canRead());
            System.out.println("Se puede escribir: "+fichero1.canWrite());
            System.out.println("Tamaño: "+fichero1.length());
            System.out.println("Es un directorio: "+fichero1.isDirectory());
            System.out.println("Es un fichero: "+fichero1.isFile());
            System.out.println("Nombre del directorio padre: "+fichero1.getParent());

        }

        else {
            System.out.println("Ese directorio o fichero no existe");
        }


    }
}

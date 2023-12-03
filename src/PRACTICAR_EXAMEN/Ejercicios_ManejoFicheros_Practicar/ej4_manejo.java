package PRACTICAR_EXAMEN.Ejercicios_ManejoFicheros_Practicar;

import java.io.File;

public class ej4_manejo {
    public static void main(String[] args) {
        File fichero1 = new File(".");

        if (fichero1.exists()){
            System.out.println("Nombre del fichero "+fichero1.getName());
            System.out.println("Ruta: "+fichero1.getPath());
            System.out.println("Ruta absoluta "+fichero1.getAbsolutePath());
            System.out.println("Se puede leer: "+fichero1.canRead());
            System.out.println("Se puede escribir "+fichero1.canWrite());
            System.out.println("Tamaño "+fichero1.length());
            System.out.println("Es un directorio: "+fichero1.isDirectory());
            System.out.println("Es un fichero: "+fichero1.isFile());
            System.out.println("Nombre del directorio padre: "+fichero1.getParent());
        }

        else {
            System.out.println("Ese directorio o fichero no existe");
        }
    }
}

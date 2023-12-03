package PRACTICAR_EXAMEN.Ejercicios_ManejoFicheros_Practicar;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ej7_manejo {
    public static void main(String[] args) {
        String ruta_fichero = "C:\\Users\\kevin\\IdeaProjects\\Acceso_Datos_Casa\\NUEVODIR\\FICHERO1.txt";
        File fichero1 = new File(ruta_fichero);

        String ruta_fichero2= "C:\\Users\\kevin\\IdeaProjects\\Acceso_Datos_Casa\\NUEVODIR\\FICHERO2.txt" ;
        File fichero2 = new File(ruta_fichero2);

        String ruta_destino = "C:\\Users\\kevin\\IdeaProjects\\Acceso_Datos_Casa\\NUEVODIR\\DIRECTORIO_COPIAS";
        File destino = new File(ruta_destino);

        if (!destino.exists()){
            if (destino.mkdir()){
                System.out.println("DIRECTORIO "+destino.getName()+ "HA SIDO CREADO ");
            }
            else {
                System.out.println("ERROR AL CREAR EL DIRECTORIO");
                return;
            }
        }

        try {
            FileUtils.copyFileToDirectory(fichero1,destino);
            System.out.println("FICHERO: "+fichero1.getName()+ " COPIADO");

            FileUtils.copyFileToDirectory(fichero2,destino);
            System.out.println("FICHERO: "+fichero2.getName()+ " COPIADO");
        }
        catch (IOException e){
            System.out.println("Error al copiar el archivo");
            e.printStackTrace();
        }
    }
}

package PRACTICAR_EXAMEN.Ejercicios_ManejoFicheros_Practicar;

import java.io.File;

public class ej5_manejo {
    public static void main(String[] args) {
        File directorio = new File("C:\\Users\\kevin\\IdeaProjects\\Acceso_Datos_Casa");



        if (directorio.exists()){
                File [] archivos = directorio.listFiles();
                int contador = 0;


                if (archivos!=null){
                    for (File archivo:archivos){
                        System.out.println("NOMBRE: "+archivo.getName()+ " ¿ES UN FICHERO? "+archivo.isFile()+ " ¿ES UN DIRECTORIO? "+archivo.isDirectory());
                        contador++;
                    }

                    System.out.println("Ficheros en el directorio actual "+contador);
                }
        }
        else {
            System.out.println("Directorio no existe");
        }
    }
}

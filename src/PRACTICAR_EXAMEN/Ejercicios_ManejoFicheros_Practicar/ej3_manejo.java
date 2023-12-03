package PRACTICAR_EXAMEN.Ejercicios_ManejoFicheros_Practicar;

import java.io.File;

public class ej3_manejo {
    public static void main(String[] args) {
        String ruta_directorio = "C:\\Users\\kevin\\IdeaProjects\\Acceso_Datos_Casa\\NUEVODIR";
        File directorio = new File(ruta_directorio);

        // Comprobamos si existe
        if (directorio.exists()){
            // CREAMOS ARRAY QUE GUARDARA EL LISTADO DEL DIRECTORIO
            File [] archivos = directorio.listFiles();
            int contador_ficheros = 0;
            int contador_directorios = 0;


            if (archivos != null){
                for (File archivo:archivos){
                    if (archivo.isDirectory()){
                        contador_directorios++;
                    } else if (archivo.isFile()) {
                        contador_ficheros++;
                    }


                }
            }
            System.out.println("DIRECTORIOS:  "+contador_directorios);
            System.out.println("FICHEROS:  "+contador_ficheros);


        }
        else {
            System.out.println("El directorio no existe");
        }
    }
}

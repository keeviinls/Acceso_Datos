package Ejercicios_ManejoFicheros;

import java.io.File;
import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        String ruta_completa = "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos" ;
        File directorio1 = new File(ruta_completa);

        //CONTAMOS EL NUMERO DE FICHEROS
        File [] listado = directorio1.listFiles();
        int contador = 0;

        for (int i =0;i<listado.length;i++){
            if (listado[i].isFile() || listado[i].isDirectory()){
                contador++;
            }
        }
        System.out.println("Ficheros en el directorio actual "+contador);

        for (int j =0;j<listado.length;j++){
            if (listado[j].isFile() || listado[j].isDirectory()){
                System.out.println("Nombre: "+listado[j].getName()+ " es fichero? "+listado[j].isFile()+ ", es directorio "+listado[j].isDirectory());
            }
        }




    }
}

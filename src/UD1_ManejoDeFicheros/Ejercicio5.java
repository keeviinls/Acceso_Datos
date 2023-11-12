package UD1_ManejoDeFicheros;

import java.io.File;

public class Ejercicio5 {
    public static void main(String[] args) {
        String ruta_completa = "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos" ;
        File directorio1 = new File(ruta_completa);

        //Creamos un array que almacenara los nombres del listado del directorio
        File [] listado = directorio1.listFiles();

        //Creamos un int que funcionara de contador
        int contador = 0;

        // Verificar si la lista de archivos no es nula Comprobamos si el array del listado es Nulo o no
        if (listado != null) {

            // En este bucle vamos recorriendo cada objeto del listado
            for (int i =0;i<listado.length;i++){

                // Ahora con el IF indicamos que sume 1 al contador cada vez que encuentre dentro
                // del listado un objeto de fichero o directorio
                if (listado[i].isFile() || listado[i].isDirectory()){
                    contador++;
                }
            }
        }

        System.out.println("Ficheros en el directorio actual "+contador);

        // Verificar si la lista de archivos no es nula Comprobamos si el array del listado es Nulo o no

        if (listado != null) {
            //Creamos otro bucle ahora que basicamente indicara lo mismo que el anterior, pero
            //luego hay un cambio
            for (int j =0;j<listado.length;j++){
                if (listado[j].isFile() || listado[j].isDirectory()){

                    //Indicamos el nombre del objeto con .getName, despues preguntamos si es un fichero con .isFile()
                    // por ultimo indicamos si es un directorio con isDirectory();
                    //Esto lo hacemos dentro del bucle con listado[j], cada vez que encuentre un objeto obtendra informaicon de ese objeto
                    // lo hira recorriendo de 1 en 1
                    System.out.println("Nombre: "+listado[j].getName()+ " es fichero? "+listado[j].isFile()+ ", es directorio "+listado[j].isDirectory());
                }
            }
        }
    }
}

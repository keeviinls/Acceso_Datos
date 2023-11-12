package UD1_ManejoDeFicheros;

import java.io.File;

public class Ejercicio6 {
    public static void main(String[] args) {

        //CREAMOS EL DIRECTORIO Y LE PONEMOS UN NOMBRE
        File directorio = new File(".");

        //CREAMOS UN ARRAY DE FILES, ESTE METODO DEVUELVE UN ARRAY DE FILES DE TODOS LOS FICHEROS QUE HAY EN EL DIRECTORIO
        File [] files = directorio.listFiles();

        System.out.println("Total de argumentos: "+args.length);
        for (int i = 0;i<args.length;i++){
            System.out.println("El argumento numero "+i+ " es : "+args.length);
            for (int j = 0; j< files.length;j++){

                // COMPROBAMOS SI HAY ALGUNA COINCIDENCIA ENTRE EL ARGUMENTO Y EL CONTENIDO DE LA RUTA
                if (files[j].getName().equalsIgnoreCase(args[i])){

                    // COMPROBAMOS SI ES UN FICHERO O DIRECTORIO
                    if (files[i].isFile()){
                        System.out.println(files[i] + " ES UN FICHERO");
                    }
                    else if (files[i].isDirectory()) {
                        System.out.println(files[i]+ " ES UN DIRECTORIO");
                    }
                }
            }
        }
    }

}



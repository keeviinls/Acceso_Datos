package UD1_ManejoDeFicheros;

import java.io.File;

public class Ejercicio2 {
    public static void main(String[] args) {

        /** PARA PODER BORRAR EL DIRECTORIO PRIMERO DEBEMOS ELIMINAR SU CONTENIDO, POR ELLO
         * PRIMERO ELIMINAREMOS SUS 2 FICHEROS DE 1 EN 1 **/

        // Creamos la ruta de nuestros ficheros y directorios.
        // Luego mas adelante la reutilizaremos para modificarla y poner la ruta de otro fichero
        String ruta_completa = "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR\\FICHERO1.TXT" ;

        File fichero1 = new File(ruta_completa);    //CREAMOS EL FICHERO 1 CON LA RUTA AÑADIDA ANTERIORMENTE
        if (fichero1.exists()){         //AQUI VERIFICAMOS SI EL FICHERO EXISTE
            if (fichero1.delete()){     //SI EXISTE PROCEDEREMOS A ELIMINARLO
                System.out.println("El fichero 1 ha sido eliminado");
            }
            else {
                System.out.println("No se ha podido eliminar el fichero 1");
            }
        }

        else {
            System.out.println("Ese fichero no existe");
        }

        //AHORA YA HEMOS ELIMINADO EL 1, MODIFICAREMOS LA RUTA PARA QUE AHORA INDIQUE EL FICHERO2.TXT

        ruta_completa = "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR\\FICHERO1-COPIA.TXT" ;
        File fichero2 = new File(ruta_completa);    //VOLVEMOS A CREAR UN FILE PERO ESTA VEZ PARA EL FICHERO 2


        if (fichero2.exists()){           //REALIZAMOS LOS MISMO PASOS QUE CON EL 1
            if (fichero2.delete()){
                System.out.println("El fichero1-copia ha sido eliminado");
            }
            else {
                System.out.println("No se ha podido eliminar el fichero1-copia ");
            }
        }

        else {
            System.out.println("Ese fichero no existe");
        }


        //YA TENEMOS LOS FICHEROS ELIMINADOS Y POR LO TANTO EL DIRECTORIO VACIO, AHORA YA PODEMOS ELIMINAR EL DIRECTORIO
        // MODIFICAMOS LA RUTA NUEVAMENTE PARA INDICAR EL DIRECTORIO

        ruta_completa = "C:\\Users\\KevinLoayzaS\\IdeaProjects\\Acceso_Datos\\NUEVODIR" ;
        File directorio = new File(ruta_completa);  // CREAMOS UN FILE PARA EL DIRECTORIO
        if (directorio.exists()){          //REALIZAMOS LOS MISMO PASOS QUE CON EL 1 Y 2
            if (directorio.delete()){
                System.out.println("El Directorio ha sido eliminado");
            }
            else {
                System.out.println("No se ha podido eliminar el Directorio");
            }
        }

        else {
            System.out.println("Ese Directorio no existe");
        }


    }
}

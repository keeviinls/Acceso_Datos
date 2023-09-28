package Ejercicios_ManejoFicheros;

import java.io.File;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear el directorio
        File directorio = new File("NUEVODIR");

        if (!directorio.exists()) {
            if (directorio.mkdir()) { /** SE traduce en: "Si la creación del directorio tiene
             éxito (es decir, si mkdir() devuelve true), haz lo siguiente..." **/

                System.out.println("Directorio creado exitosamente.");
            } else {
                System.err.println("No se pudo crear el directorio.");



                return;   /** Después de imprimir el mensaje de error, se utiliza la instrucción return; para salir
                 * inmediatamente del método main(). Esto significa que el programa se detendrá y no continuará
                 * ejecutándose más allá de este punto. La razón de esta acción es evitar que el programa continúe ejecutándose
                 * cuando no se pudo crear el directorio.                 **/
            }
        } else {
            System.out.println("El directorio ya existe.");
        }

        // Crear los archivos dentro del directorio
        File archivo1 = new File(directorio, "FICHERO1.txt");
        File archivo2 = new File(directorio, "FICHERO2.txt");

        try {
            if (archivo1.createNewFile()) {
                System.out.println("FICHERO1 creado exitosamente.");
            } else {
                System.err.println("No se pudo crear el archivo 1.");
            }

            if (archivo2.createNewFile()) {
                System.out.println("FICHERO2 creado exitosamente.");
            } else {
                System.err.println("No se pudo crear el archivo 2.");
            }
            // Renombrar el archivo2.txt
            File nuevoArchivo1 = new File(directorio, "FICHERO1-COPIA.txt");
            if (archivo2.renameTo(nuevoArchivo1)) {
                System.out.println("Archivo 2 renombrado exitosamente a " + "nuevo_fichero2.txt");
            } else {
                System.err.println("No se pudo renombrar el archivo 2.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

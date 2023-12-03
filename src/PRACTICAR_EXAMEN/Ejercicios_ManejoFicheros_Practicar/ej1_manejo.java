package PRACTICAR_EXAMEN.Ejercicios_ManejoFicheros_Practicar;

import java.io.File;
import java.io.IOException;

public class ej1_manejo {
    public static void main(String[] args) {
        //CREAR DIRECTORIO
        File directorio = new File("NUEVODIR");

        if (!directorio.exists()){
            if (directorio.mkdir()){
                System.out.println("Directorio creado correctamente");
            }
            else {
                System.out.println("No se ha podido crear el directorio");

                return;  /** Después de imprimir el mensaje de error, se utiliza la instrucción return; para salir
                 * inmediatamente del método main(). Esto significa que el programa se detendrá y no continuará
                 * ejecutándose más allá de este punto. La razón de esta acción es evitar que el programa continúe ejecutándose
                 * cuando no se pudo crear el directorio.                 **/
            }
        }
        else {
            System.out.println("El directorio ya existe");
        }

        //CREAR ARCHIVOS
        File archivo1 = new File(directorio, "FICHERO1.txt");
        File archivo2 = new File(directorio, "FICHERO2.txt");

        try {
            if (archivo1.createNewFile()){
                System.out.println(archivo1.getName()+ " CREADO CON EXITO");
            }
            else  {
                System.out.println("No se puedo crear el "+archivo1.getName());
            }

            if (archivo2.createNewFile()){
                System.out.println(archivo2.getName()+ " CREADO CON EXITO");
            }
            else  {
                System.out.println("No se puedo crear "+archivo2.getName());
            }
        }catch (IOException e){
            System.out.println("No se pudo crear los archivos");
            e.printStackTrace();
        }

        //RENOMBRAR FICHERO1.TXT

        File nuevo_archivo1 = new File(directorio, "FICHERO1-COPIA.txt");


        if (archivo1.exists()){
            if (archivo1.renameTo(nuevo_archivo1)){
                System.out.println(archivo1.getName()+ " renombrado a "+nuevo_archivo1.getName());
            }
            else {
                System.out.println("No se pudo renombrar el "+archivo1.getName());
            }
        }
        else {
            System.out.println("El archivo original no existe");
        }

    }
}

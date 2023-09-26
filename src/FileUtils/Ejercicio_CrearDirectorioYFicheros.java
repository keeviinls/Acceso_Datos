package FileUtils;

import java.io.File;

public class Ejercicio_CrearDirectorioYFicheros {
    public static void main(String[] args) {
        //Crea los objetos : Un directorio y 2 ficheros
        File d = new File("NUEVOIR");
        File f1 = new File("FICHERO1.TXT");
        File f2 = new File("FICHERO2.TXT");

        //creo directorio
        if (!d.mkdir()){
            System.out.println("No se ha podido crear el directorio");
            System.exit(-1);
        }
    }
}

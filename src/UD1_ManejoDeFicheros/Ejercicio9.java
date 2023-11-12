package UD1_ManejoDeFicheros;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        File fichero = new File("C:\\Users\\kevin\\IdeaProjects\\Acceso_Datos_Casa\\Ficheros_Ejercicio9");

        //Guardamos en una variable la informacion de los ficheros, con esto evitamos que se modifique cuando cambiamos los archivos de ubicacion

        int tamaño = fichero.listFiles().length;
        File[] array_ficheros = fichero.listFiles();

        //COMPROBAMOS SI HAY FICHERO PARA MOVER

        if (array_ficheros.length==0){
            throw new Exception("No hay ficheros para ordenar");
        }

        //RECORREMOS LOS FICHEROS QUE PUEDA HABER

        for (int i=0; i<tamaño;i++){

            //COMPROBAMOS SI EL TAMAÑO ES MAYOR A 362KB Y LOS MOVEMOS A DirPDFmayores, por lo contrario si es menos se van a DirPDFMenores
            if (array_ficheros[i].length() > 362000 && array_ficheros[i].isFile()){
                try {
                    FileUtils.moveFileToDirectory(array_ficheros[i], new File("C:\\Users\\kevin\\IdeaProjects\\Acceso_Datos_Casa\\Ficheros_Ejercicio9\\DirPDFmayores"), true);
                }catch (Exception e){
                    System.out.println("No se ha podido mover el fichero "+array_ficheros[i].getName()+ " al directorio DirPDFmayores");
                }
            }
            else if (array_ficheros[i].isFile()) {
                try {
                    FileUtils.moveFileToDirectory(array_ficheros[i], new File("C:\\Users\\kevin\\IdeaProjects\\Acceso_Datos_Casa\\Ficheros_Ejercicio9\\DirPDFmenores"), true);
                }catch (Exception e){
                    System.out.println("No se ha podido mover el fichero "+array_ficheros[i].getName()+ " al directorio DirPDFmenores");
                }
            }
        }

        //VOLVEMOS A GUARDAR LA INFORMACION DEL DIRECTORIO PARA EVITAR QUE SE MODIFIQUE DURANTE EL PROCESO

        File fichero_dos = new File("C:\\Users\\kevin\\IdeaProjects\\Acceso_Datos_Casa\\Ficheros_Ejercicio9\\DirPDFmenores");
        tamaño = fichero_dos.listFiles().length;
        array_ficheros = fichero_dos.listFiles();

        //AHORA COMPROBAREMOS SI ALGUNO EMPIEZA POR ALGUNA LETRA ENTRE A-N, SI ESTO OCURRE LO MOVEREMOS A UN DIRECTORIO LLAMADO DirPDFpequesAZ

        for (int i=0; i<tamaño;i++){
            if (array_ficheros[i].isFile()){
                switch (array_ficheros[i].getName().split("")[0].toLowerCase()){
                    case "a":
                    case "b":
                    case "c":
                    case "d":
                    case "e":
                    case "f":
                    case "g":
                    case "h":
                    case "i":
                    case "j":
                    case "k":
                    case "l":
                    case "m":
                    case "n":
                        try {
                            FileUtils.moveFileToDirectory(array_ficheros[i], new File("C:\\Users\\kevin\\IdeaProjects\\Acceso_Datos_Casa\\Ficheros_Ejercicio9\\DirPDFmenores\\DirPDFpequesAZ"), true);
                        }catch (Exception e){
                            System.out.println("Error al mover el fichero "+array_ficheros[i].getName()+ " al directorio DirPDFpequesAZ");
                        }
                }
            }
        }

        //RECORREMOS DirPDFmayores Y LO GUARDAMOS EN UN ARRAYLIST, LO ORDENAMOS POR PESO Y RENOMBRAMOS SEGUN EL ORDEN

        File fichero_ordenado_peso_y_renombrados = new File("C:\\Users\\kevin\\IdeaProjects\\Acceso_Datos_Casa\\Ficheros_Ejercicio9\\DirPDFmayores");

        ArrayList<File> ficherosAL = new ArrayList<>(Arrays.asList(fichero_ordenado_peso_y_renombrados.listFiles()));
        ficherosAL.sort(Comparator.comparing(File::length).reversed());

        for (int i=0;i<ficherosAL.size();i++){
            ficherosAL.get(i).renameTo(new File(fichero_ordenado_peso_y_renombrados, (i+1)+ficherosAL.get(i).getName()));
        }

    }
}

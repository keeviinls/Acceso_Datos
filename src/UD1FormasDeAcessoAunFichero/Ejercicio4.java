package UD1FormasDeAcessoAunFichero;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        // CREAMOS EL FILERIDER E INDICAMOS LE FICHERO QUE QUEREMOS QUE LEA
        FileReader fichero = new FileReader("FichTexto.txt");

        // LEEMOS EL FICHERO
        int valor = fichero.read();
        while (valor != -1) {
            System.out.print((char) valor);
            valor=fichero.read();
        }
        // Cerramos el fichero
        fichero.close();
    }
}


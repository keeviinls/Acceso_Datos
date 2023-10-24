package ConvertirObjetoEnFichero;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FicherosBinariosPersona {

    public static void main(String[] args) {
        //CREACION DE UN FICHERO EN EL DIRECTORIO ACTUAL DE TRABAJO
        File file1 = new File("persona1");
        guardarObjeto(file1);
    }

    private static void guardarObjeto(File file1) {
        Persona persona1 = new Persona(1,"Kevin", 22, "49998728V");

        try {
            if (file1.createNewFile()) {
                System.out.println("Se ha creado el archivo: " + file1.getName());
            } else {
                System.out.println("El archivo ya existe: " + file1.getName());
            }

            try (FileOutputStream fileOut = new FileOutputStream(file1);
                 ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

                objectOut.writeObject(persona1);
                System.out.println("Objeto guardado en el archivo: " + file1.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

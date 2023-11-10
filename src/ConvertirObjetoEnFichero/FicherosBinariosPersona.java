package ConvertirObjetoEnFichero;

import java.io.*;

public class FicherosBinariosPersona {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // CREAMOS EL FICHERO
        File file = new File("persona1");
        // LLAMAR AL METOOD DE GUARDAR OBJETO
        guardarObjeto(file);
        // LLAMAR AL METODO DE RECUPERAR OBJETO
        recuperarObjeto(file);
    }

    public static void guardarObjeto(File file) throws IOException {
        // CREAMOS LA PERSONA Y LE AÑADIMOS LOS DATOS
        Persona persona = new Persona(1, "Zoro", 1, "49998728V");
        System.out.println("La persona ha sido creada");

            // CREAMOS UN FLUJO DE SALIDA, YA QUE HAY QUE ENVIAR DATOS DESDE UN PROGRAMA HACIA UN DESTINO
            FileOutputStream fichero_salida = new FileOutputStream(file);

            // CREAR EL OBJECTOUTPUTSTREAM QUE ESTE ASOCIADO AL FLUJO
            ObjectOutputStream out = new ObjectOutputStream(fichero_salida);

            // DENTRO DEL FLUJO DE SALIDA, ESCRIBIR A LA "PERSONA""
            out.writeObject(persona);

            // CERRAR EL OBJETO DE FLUJO Y EL FICHERO
            out.close();
            fichero_salida.close();

    }

    public static void recuperarObjeto(File file) throws IOException, ClassNotFoundException {

            // CREACION DEL FLUJO DE ENTRADA, YA QUE HAY QUE ENVIAR DATOS DESDE UNA FUENTA A UN PROGRAMA
            FileInputStream fichero_entrada = new FileInputStream(file);

            // CREAR EL OBJECTOUTPUTSTREAM QUE ESTE ASOCIADO AL FLUJO
            ObjectInputStream in = new ObjectInputStream(fichero_entrada);

            // Lectura del objeto de tipo Persona desde el flujo de entrada y casting al tipo Persona
            Persona persona = (Persona) in.readObject();

            // MODIFICAMOS ALGO DE LA PERSONA
            persona.setEdad(31);

            // Creación de un nuevo flujo de salida de bytes hacia el archivo
            FileOutputStream fileOut = new FileOutputStream(file);

            // Creación de un nuevo ObjectOutputStream que se conecta al nuevo flujo de salida de bytes
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Escribir el objeto persona modificado en el nuevo flujo de salida
            out.writeObject(persona);

            // Cerrar el ObjectInputStream, el flujo de entrada de bytes, el ObjectOutputStream y el flujo de salida de bytes
            in.close();
            fichero_entrada.close();
            out.close();
            fileOut.close();



    }
}

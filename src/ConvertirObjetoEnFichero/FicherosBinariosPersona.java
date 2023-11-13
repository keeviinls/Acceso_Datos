package ConvertirObjetoEnFichero;

import javax.swing.table.TableRowSorter;
import java.io.*;

public class FicherosBinariosPersona {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // CREAMOS EL ATRIBUTO DEL FICHERO
        File fichero = new File("./persona1");
        // LLAMAR AL METOOD DE GUARDAR OBJETO
        guardarObjeto(fichero);
        // LLAMAR AL METODO DE RECUPERAR OBJETO
        recuperarObjeto(fichero);
    }

    public static void guardarObjeto(File fichero)  {

        /**
         * VERIFICAMOS SI EL FICHERO SE CREA CORRECTAMENTE
         */

        try {
            fichero.createNewFile();    //CREAMOS EL FICHERO
        }catch (IOException e){
            System.out.println("El fichero "+fichero.getName()+ " no se ha podido crear correctamente");   //MOSTRAMOS EL MENSAJE QUE MOSTRARA SI OCURRE UN ERROR
            System.out.println("Este error ha ocurrido debido a: ");    // ESTO ES OTRO MENSAJE QUE SE MOSTRARA DEBAJO DEL ANTERIOR
            System.out.println(e.getMessage());     // MUESTRA EL ERROR CONCRETAMENTE
            System.exit(-1);    //USAMOS System.exit PARA QUE CUANDO EL PROGRAMA LLEGUE HASTA AQUI, CIERRE COMPLETAMENTE SU EJECUCION. EL "-1" INDICA QUE EL PROGRAMA SE HA CERRADO CON UN CODIGO DE SALIDA ESPECIFICO
        }

        /**
         * CREAMOS EL OBJETO PERSONA Y LE AÑADIMOS LOS DATOS
         */
        Persona persona = new Persona(1, "Zoro", 1, "49998728V");   //CREAMOS LA PERSONA Y LE AÑADIMOS LOS DATOS
        System.out.println("La persona ha sido creada");

        /**
         * CREAMOS EL FLUJO DE DATOS, QUE SERA DE SALIDA
         */

        FileOutputStream fichero_salida = null;  //EL FLUJO DE SALIDA LE PONEMOS NOMBRE FUERA DEL TRY Y CATCH, PARA QUE ASI SEA VISIBLE MAS ABAJO

        // MODIFICAMOS EL FLUJO DE SALIDA BASICAMENTE CREANDOLO, YA QUE HAY QUE ENVIAR DATOS DESDE UN PROGRAMA HACIA UN DESTINO

        try {
             fichero_salida = new FileOutputStream(fichero);
        } catch (FileNotFoundException e){
            System.out.println("No se ha encontrado el fichero "+fichero.getName());
            System.out.println("Este error ha ocurrido debido a: ");
            System.out.println(e.getMessage());
            System.exit(-2);
        }

        /**
         * CREAMOS EL OBJECTOUTPUTSTREAM ASOCIANDOLO AL FLUJO
         */

        ObjectOutputStream out = null;  // IGUAL QUE EL FLUJO DE SALIDA, LE PONEMOS NOMBRE FUERA PARA QUE SEA VISIBLE

            // CREAR EL OBJECTOUTPUTSTREAM QUE ESTE ASOCIADO AL FLUJO
        try {
            out = new ObjectOutputStream(fichero_salida);

        }catch (IOException e){
            System.out.println("No se ha podido crear el ObjectOutputStream");
            System.out.println("Este error ha ocurrido debido a: ");
            System.out.println(e.getMessage());
            System.exit(-3);
        }

        /**
         * DENTRO DEL FLUJO DE SALIDA ESCRIBIMOS AL OBJETO, QUE RECORDEMOS QUE ES PERSONA
         */

        try {
            out.writeObject(persona);
        } catch (IOException e){
            System.out.println("No se ha podido escribir en el fichero "+fichero.getName());
            System.out.println("Este error ha ocurrido debido a: ");
            System.out.println(e.getMessage());
            System.exit(-4);
        }

        /**
         * CERRAMOS EL OBJETO DE FLUJO
         */
        try {
            out.close();
        }catch (IOException e){
            System.out.println("No se ha podido cerrar el ObjectOutputStream");
            System.out.println("Este error ha ocurrido debido a: ");
            System.out.println(e.getMessage());
            System.exit(-5);
        }

        /**
         * CERRAMOS EL FICHERO
         */

        try {
            fichero_salida.close();
        }catch (IOException e){
            System.out.println("No se ha podido cerrar el fichero "+fichero.getName());
            System.out.println("Este error ha ocurrido debido a: ");
            System.out.println(e.getMessage());
            System.exit(-6);
        }

    }

    public static void recuperarObjeto(File fichero)  {

        /**
         * CREACION DEL FLUJO DE ENTRADA, YA QUE HAY QUE ENVIAR DATOS DESDE UNA FUENTA A UN PROGRAMA
         */
        FileInputStream fichero_entrada = null;

        try {
           fichero_entrada = new FileInputStream(fichero);
        }catch (IOException e){
            System.out.println("No se ha podido abrir el flujo de entrada llamado 'fichero_entrada'");
            System.out.println("Este error ha ocurrido debido a: ");
            System.out.println(e.getMessage());
            System.exit(-7);
        }

        /**
         * CREAR EL OBJECTOUTPUTSTREAM QUE ESTE ASOCIADO AL FLUJO
         */

        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(fichero_entrada);
        } catch (IOException e){
            System.out.println("No se ha poido abrir el ObjectInputStream llamado 'in'");
            System.out.println("Este error ha ocurrido debido a: ");
            System.out.println(e.getMessage());
            System.exit(-8);
        }

        /**
         * LEEMOS EL OBJETO PERSONA
         */

        Persona persona = null;

        try {
            persona = (Persona) in.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.out.println("No se ha podido recuperar el objeto del fichero");
            System.out.println("Este error ha ocurrido debido a: ");
            System.out.println(e.getMessage());
            System.exit(-9);
        }

        /**
         * MODIFICAMOS ALGO DEL OBJETO PERSONA CREADO ANTERIORMENTE
         */
        persona.setNombre("Kevin");

        /**
         * CREAMOS UN NUEVO FLUJO DE SALIDA HACIA EL FICHERO
         */

        FileOutputStream nuevo_file_out = null;
        try {
            nuevo_file_out = new FileOutputStream(fichero);
        }catch (IOException e){
            System.out.println("No se ha crear el nuevo flujo de salida");
            System.out.println("Este error ha ocurrido debido a: ");
            System.out.println(e.getMessage());
            System.exit(-10);
        }

        /**
         * CREAMOS UN NUEVO OBJECTOUTPUTSTREAM QUE CONECTO CON EL NUEVO FLUJO
         */

        ObjectOutputStream nuevo_outputStream = null;

        try {
            nuevo_outputStream = new ObjectOutputStream(nuevo_file_out);
        }catch (IOException e){
            System.out.println("No se ha podido crear el nuevo ObjectOutputStream");
            System.out.println("Este error ha ocurrido debido a: ");
            System.out.println(e.getMessage());
            System.exit(-11);
        }

        /**
         * ESCRIBIMOS LA PERSONA MODIFICADA EN EL FLUJO DE SALIDA
         */

        try {
            nuevo_outputStream.writeObject(persona);
        }catch (IOException e){
            System.out.println("No se ha podiodo escribir el nuevo dato de la persona");
            System.out.println("Este error ha ocurrido debido a: ");
            System.out.println(e.getMessage());
            System.exit(-12);
        }

        /**
         * CERRAMOS EL OBJECTINPUTSTREAM, EL FLUJO DE ENTRADA, EL OBJECTOUTPUTSTREAM Y EL FLUJO DE SALIDA
         */

        try {
            in.close();
            fichero_entrada.close();
            nuevo_outputStream.close();
            nuevo_file_out.close();
        }catch (IOException e){
            System.out.println("Error al cerrar ObjectInput, ObjectOutput, y los flujos de entrada y salida");
            System.out.println("Este error ha ocurrido debido a: ");
            System.out.println(e.getMessage());
            System.exit(-13);
        }
    }

}


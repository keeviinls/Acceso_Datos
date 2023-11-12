package UD1_ManejoDeExcepciones;

public class Ejercicio_2 {
    public static void main(String[] args) {

        /** ArithmeticException:
         * Se genera cuando se produce una condición aritmética excepcional.
         * Por ejemplo, cuando intentamos dividir un número entre cero. **/

        try {

            //Creamos una variable de tipo Int que almacenara el resultado
            int resultado;

            //Como ejemplo haremos que ese resultado almacene el resultado de 5/0 que da 0
            resultado = 5/0;

            //Imprimimos el resultado
            System.out.println(resultado);
        }

        //Ahora establecemos que catch capte el error de ArithmeticExceptcion
        catch (ArithmeticException e){

            //Teniendo en cuenta que el resultado es 0, catch actuara mostrando el mensaje siguiente
            //Que es basicamente el nombre del fallo y la razon por la que ha fallado
            System.out.println("AritmeticExceotion: "+e.getMessage());

            /** ESTO ES PARTE DEL EJERCICIO 6 , YA QUE PIDE USAR EN LOS EJERCICIOS 2 Y 3 ALGUNOS METODOS COMO printStackTrace.
             * printStackTrace:
             *Es una herramienta muy sencilla, pero muy útil para diagnosticar una excepción. Te dice qué ha pasado y en qué parte del código ha ocurrido.
             * **/

            System.out.println("Error del printStackTrace():");
            e.printStackTrace();
        }
    }
}

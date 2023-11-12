package UD1_ManejoDeExcepciones;

import java.util.Scanner;

public class Ejercicio_3 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        /** java.util.InputMismatchException:
         *  Es lanzada por la clase Scanner cuando el elemento recibido no corresponde
         *  al tipo de dato esperado.**/

        try {

            //Mostraremos un mensaje indicando que el usuario introduzca un numero cualquiera
            System.out.println("Dime un numero cualquiera");

            //Creamos la variable Int y usaremos la clase Scanner para que el usuario pueda escribir el numero
            int numero = sc.nextInt();

            //Imprimiremos el numero introducido por el usuario
            System.out.println(numero);
        }

        //Ahora establecemos que catch capte el error java.util.InputMismatchException
        catch (java.util.InputMismatchException e){

            //Supongamos que el usuario de escribir un numero escribe un nombre o letra cualquiera,
            //Catch actura mostrando el mensaje siguiente que es basicamente que no has seleccionado un numero
            System.out.println("No has seleccionado un valor esperado:  "+e.getMessage());


            /** ESTO ES PARTE DEL EJERCICIO 6 , YA QUE PIDE USAR EN LOS EJERCICIOS 2 Y 3 ALGUNOS METODOS COMO printStackTrace.
             * printStackTrace:
             *Es una herramienta muy sencilla, pero muy útil para diagnosticar una excepción. Te dice qué ha pasado y en qué parte del código ha ocurrido.
             * **/

            System.out.println("Error del printStackTrace():");
            e.printStackTrace();
        }

    }
}

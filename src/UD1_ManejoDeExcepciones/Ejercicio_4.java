package UD1_ManejoDeExcepciones;

import java.util.Scanner;

public class Ejercicio_4 {
    /**
     * ESTE EJERCICIO TRATA SOBRE RETOCAR EL EJERCICIO 4 DE EJERCICIOS DE REPASO
     * ESTO ES UNA COPIA PARA NO MODIFICARLA LA VERDADERA
     */

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Pedimos al usuario que introduzca una nota
        System.out.println("Dime tu nota de clase del 0 al 10");

        //Almacenamos esa nota en una variable Int, y nos ayudamos de la clase scanner para que el usuario introduzca la nota
        int nota = sc.nextInt();

        try {

            //Establecemos que si la nota es inferior al 5 muestre una excepcion
            if (nota < 5){

                //Esta excepcion es creada por nosotros, dentro ponemos le mensaje que queramos que aparezca
                //Luego mas abajo estabnlecemos esta excepcion
                throw new NotaSuspensaException("Insuficiente");
            }

            //Usamo un switch para tener controlada la nota que introduce el usuario y darle una respuesta segun la nota que ponga
            switch (nota){

                case 5:
                    System.out.println("Suficiente");break;
                case 6:
                    System.out.println("Bien");break;
                case 7:
                    System.out.println("Notable");break;
                case 8:
                    System.out.println("Notable");break;
                case 9:
                    System.out.println("Sobresaliente");break;
                case 10:
                    System.out.println("Sobresaliente");break;
                default:
                    System.out.println("Error, nota incorrecta");break;
            };


        //Con el Catch usamos nuestra excepcion creada antes
        }catch (NotaSuspensaException e){
            //Mostramos un mensaje propio quie mostrara el error por el que ha saltado
            System.out.println("Error: "+e.getMessage());
        }

    }
    //Declaramos la clase de NotaSuspensaExcepction en donde crearemos el objeto para que se lanze en nuestro programa
    private static class NotaSuspensaException extends Throwable {
        public NotaSuspensaException(String mensaje) {
            super(mensaje);
        }
    }
}

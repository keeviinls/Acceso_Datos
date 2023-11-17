package UD1_1_RepasoJAVAejercicios;

import java.util.Scanner;

public class Ejercicio_6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //CREAMOS LAS VARIABLES PARA NUMERO Y RESULTADO
        int resultado;
        int numero = 0;

        do {

            System.out.println("Dime un numero entre 0 y 10"); //PEDIMOS AL USUARIO UN NUMERO Y LO GUARDAMOS EN LA VARIABLE NUMERO
            numero = sc.nextInt();

            // INDICAMOS QUE EL NUMERO DEBE SER MAYOR O IGUAL A 0 Y MENOR O IGUAL A 10
            if (numero >= 0 && numero <=10){

                //CREAMOS UN BUCLE QUE DONDE I VALDRA 0, SUMARA DE 1 EN 1 CADA VEZ QUE SE REPITA Y PARARÁ CUANDO LLEGUE A 20
                for (int i = 0; i<=20 ; i++ ){


                    resultado = numero * i; // INDICAMOS QUE EL RESULTADO ES EL NUMERO INDICADO POR EL USUARIO Y MULTIPLICADO POR I, QUE EN EL PRIMER CASO SERA 0, EN LA SEGUNDA VUELTA 1 Y ASI SUCESIVAMENTE
                    System.out.println(numero + " X "+i + " = "+resultado); // IMPRIMIMOS EL MENSAJE CON EL NUMERO DEL USUARIO, EL NUMERO POR EL QUE SE MULTIPLICA Y EL RESULTADO
                }
            }
            else {
                // ESTE MENSAJE SE MOSTRARA EN CASO DE QUE EL USUARIO NO HAYA PUESTO UN NUMERO ENTRE EL 0 Y EL 10
                System.out.println("Has seleccionado un numero erroneo");
            }

            // CON EL WHILE INDICAMOS QUE SI EL NUMERO ES MENOR A 0 O MAYOR A 10, SE REPITA HASTA QUE EL USUARIO META UN NUMERO CORRECTO
        } while (numero <=0 || numero>=10);

    }
}

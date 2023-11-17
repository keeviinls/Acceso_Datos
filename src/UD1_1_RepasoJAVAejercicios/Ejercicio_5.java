package UD1_1_RepasoJAVAejercicios;

import java.util.Scanner;

public class Ejercicio_5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //CREAMOS LAS VARIABLES PARA GUARDAR EL NUMERO ALEATORIO, EL NUMERO DE INTENTOS Y EL NUMERO QUE ESCRIBA EL USUARIO
        int numero_aleatorio;
        int numero_intentos = 0;
        int numero_usuario;

        //GENERAMOS EL NUMERO ALEATORIO, INDICAMOS QUE DEBE SER ENTRE 0-100
        numero_aleatorio = (int) (Math.random() * (100-0+1) + 0);



        do {


            System.out.println("Dime un numero entre 0 - 100");     //PEDIMOS AL USUARIO QUE ESCRIBA UN NUMERO ENTRE 0 Y 100
            numero_usuario = sc.nextInt();  // GUARDAMOS EL NUMERO QUE INDIQUE EL USUARIO CON LA AYUDA DEL SCANNER


            if (numero_usuario == numero_aleatorio){    // SI EL NUMERO QUE INGRESA EL USUARIO ES IGUAL AL DE ALEATORIO, LE MOSTRARA UN MENSAJE INDICANDOLO Y SE SUMARA 1 AL NUMERO DE INTENTO
                System.out.println("Felicidades has acertado");
                numero_intentos=numero_intentos+1;
            }
            else if (numero_usuario > numero_aleatorio){    // SI EL NUMERO ES MAYOR, SE LO INDICARA Y TAMBIEN SUMARA 1 EN EL NUMERO DE INTENTOS
                System.out.println("Busca un numero menor");
                numero_intentos=numero_intentos+1;

            }
            else if (numero_usuario < numero_aleatorio){
                System.out.println("Busca un numero mayor"); // SI EL NUMERO ES MENOR, SE LO INDICARA Y TAMBIEN SUMARA 1 EN EL NUMERO DE INTENTOS
                numero_intentos=numero_intentos+1;

            }

        }while (numero_usuario != numero_aleatorio);    // CON EL WHILE INDICAMOS QUE SI EL NUMERO DEL USUARIO ES DIFERENTE AL DE ALEATORIO, SE VOLVERA A INTENTAR HASTA QUE EL USUARIO ACIERTE

        System.out.println("Tu numero de intentos es "+numero_intentos);   //INDICAMOS CON UN MENSAJE EL NUMERO DE INTENTATOS QUE HA REALIZADO EL USUARIO HASTA ACERTAR EL NUMERO

    }
}

package UD1_1_RepasoJAVAejercicios;

import java.util.Scanner;

public class Ejercicio_5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numero_aleatorio;
        int numero_intentos = 0;
        int numero_usuario;

        numero_aleatorio = (int) (Math.random() * (100-0+1) + 0);
        System.out.println(numero_aleatorio);



        do {

            System.out.println("Dime un numero entre 0 - 100");
            numero_usuario = sc.nextInt();

            if (numero_usuario == numero_aleatorio){
                System.out.println("Felicidades has acertado");
                numero_intentos=numero_intentos+1;
            }
            else if (numero_usuario > numero_aleatorio){
                System.out.println("Busca un numero menor");
                numero_intentos=numero_intentos+1;

            }
            else if (numero_usuario < numero_aleatorio){
                System.out.println("Busca un numero mayor");
                numero_intentos=numero_intentos+1;

            }



        }while (numero_usuario != numero_aleatorio);

        System.out.println("Tu numero de intentos es "+numero_intentos);

    }
}

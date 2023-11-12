package UD1_1_RepasoJAVAejercicios;

import java.util.Scanner;

public class Ejercicio_6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int resultado;
        int numero = 0;

        do {

            System.out.println("Dime un numero entre 0 y 10");
            numero = sc.nextInt();
            if (numero >= 0 && numero <=10){
                for (int i = 0; i<=20 ; i++ ){

                    resultado = numero * i;
                    System.out.println(numero + " X "+i + " = "+resultado);
                }
            }
            else {
                System.out.println("Has seleccionado un numero erroneo");
            }
        } while (numero <=0 || numero>=10);

    }
}

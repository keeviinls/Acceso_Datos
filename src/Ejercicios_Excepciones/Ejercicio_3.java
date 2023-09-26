package Ejercicios_Excepciones;

import java.util.Scanner;

public class Ejercicio_3 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        try {
            System.out.println("Dime un numero cualquiera");
            int numero = sc.nextInt();
            System.out.println(numero);
        }
        catch (java.util.InputMismatchException e){
            System.out.println("No has seleccionado un numero:  "+e.getMessage());
        }

    }
}

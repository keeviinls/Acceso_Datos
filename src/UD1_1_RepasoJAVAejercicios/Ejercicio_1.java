package UD1_1_RepasoJAVAejercicios;

import java.util.Scanner;

public class Ejercicio_1 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String nombre;
        System.out.println("Dime tu nombre de usuario");
        nombre = sc.next();
        System.out.println("Dime tu edad");
        int edad = sc.nextInt();

        System.out.println("Buenos dias "+nombre+" tu edad es de "+edad);
    }
}

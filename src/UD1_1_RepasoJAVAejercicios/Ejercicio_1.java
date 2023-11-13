package UD1_1_RepasoJAVAejercicios;

import java.util.Scanner;

public class Ejercicio_1 {

    public static Scanner sc = new Scanner(System.in);  // CREAMOS EL SCANNES Y LE PONEMOS UN NOMBRE
    public static void main(String[] args)  {
        String nombre;  //CREAMOS LA VARIABLE STRING
        System.out.println("Dime tu nombre de usuario");    //IMPRIMIMOS EL MENSAJE
        nombre = sc.next(); //GUARDAMOS LO QUE ESCRIBA EL USUARIO EN LA VARIABLE CREADA ANTERIORMENTE
        System.out.println("Dime tu edad");
        int edad = sc.nextInt();

        System.out.println("Buenos dias "+nombre+" tu edad es de "+edad);   //IMPRIMIMOS EL MENSAJE FINAL QUE MUESTRA EL NOMBRE Y EDAD DEL USUARIO
    }
}

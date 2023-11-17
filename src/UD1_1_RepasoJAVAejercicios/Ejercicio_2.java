package UD1_1_RepasoJAVAejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int [] numeros = new int[3];    //CREAMOS UN ARRAY DE NUMEROS Y LE PONEMOS UN NOMBRE, DESPUES LE PONEMOS QUE TENGA UN TAMAÑO DE 3
        System.out.println("Dime el primer numero");    //PEDIMOS AL USUARIO QUE ESCRIBA EL PRIMER NUMERO
        numeros[0] = sc.nextInt();  //GUARDAMOS LA RESPUESTA DEL USUARIO EN LA VARIABLE DEL ARRAY [0], ESTO SIGNIFICA QUE SE GUARDARA EN EL ESPACIO0, OSEA EL PRIMERO, DEL ARRAY

        //HACEMOS LO MISMO CON LOS DEMAS

        System.out.println("Dime el segundo numero");
        numeros[1]  = sc.nextInt();

        System.out.println("Dime el tercer numero");
        numeros[2]  = sc.nextInt();

        Arrays.sort(numeros);     //CON Arrays.sort ORDENAMOS EL CONTENIDOD EL ARRAY.
        System.out.println(Arrays.toString(numeros));   //IMPRIMIMOS EL CONTENIDO DEL ARRAY
    }
}

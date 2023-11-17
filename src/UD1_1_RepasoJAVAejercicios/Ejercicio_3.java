package UD1_1_RepasoJAVAejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //CREAMOS LA VARIABLE STRING QUE GUARDARA UN JOptionPane, ES COMO UN SCANNER PERO ESTO MOSTRARÁ UNA PEQUEÑA VENTANA CON EL MENSAJE QUE INDIQUEMOS
        String letra = JOptionPane.showInputDialog("Dime una letra");

        // CON LA AYUDA DE IF Y ELSE INDICAMOS SI LA LETRA INDICADA ESTA EN MAYUSCULA (toUpperCase), MOSTRARA UN MENSAJE INDICANDOLO
        if (letra == letra.toUpperCase()){
            System.out.println("La letra es mayuscula");
        }
        // POR LO CONTRARIO SI NO ESTA EN MAYUSCULA, PUES NO QUEDA OTRA DE QUE SEA MINUSCULA
        else {
            System.out.println("La letra es minuscula");
        }


        System.out.println(letra);  //IMPRIMOS LA LETRA INDICADA
    }
    
}

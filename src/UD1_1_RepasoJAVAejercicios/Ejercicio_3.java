package UD1_1_RepasoJAVAejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String letra = JOptionPane.showInputDialog("Dime una letra");

        if (letra == letra.toUpperCase()){
            System.out.println("La letra es mayuscula");
        }

        else {
            System.out.println("La letra es minuscula");
        }
        System.out.println(letra);
    }
    
}

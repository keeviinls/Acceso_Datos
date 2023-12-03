package PRACTICAR_EXAMEN.Ejercicios_Exepciones_Practicar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.println("Dime un numero de dia del mes");
            int numero_dia = sc.nextInt();
            System.out.println("Ok has elegido "+numero_dia);
        }catch (InputMismatchException i){
            System.out.println("Error, no has elgido un numero.");
            System.out.println(i);
        }

    }
}

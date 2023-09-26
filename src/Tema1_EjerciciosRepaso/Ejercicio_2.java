package Tema1_EjerciciosRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int [] numeros = new int[3];
        System.out.println("Dime el primer numero");
        numeros[0] = sc.nextInt();

        System.out.println("Dime el segundo numero");
        numeros[1]  = sc.nextInt();

        System.out.println("Dime el tercer numero");
        numeros[2]  = sc.nextInt();

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}

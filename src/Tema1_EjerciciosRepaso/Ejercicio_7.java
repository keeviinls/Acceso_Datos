package Tema1_EjerciciosRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int numeros = 0;
        int[] array_numeros = new int[5];

        for (int i = 0; i<array_numeros.length;i++){
            System.out.println("Dime un numero para el ESPACIO "+i);
            numeros = sc.nextInt();
            array_numeros[i]=numeros;
        }
        double media = calcularMediaArray(array_numeros);



        System.out.println(Arrays.toString(array_numeros));
        System.out.println("Su media es "+media);
    }

    public static double calcularMediaArray(int[] array_numeros){
        double resultado = 0;
        

        for (int i = 0;i<array_numeros.length;i++){

            resultado = resultado + array_numeros[i];
        }
        resultado = resultado / 5;


        return resultado;
    }
}

package Ejercicios_Excepciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] array = new int[2][3];
        for (int i=0;i<array.length;i++){
            System.out.println("");
            for (int j=0;j<array[i].length;j++){
                    int resultado = i+j;
                    array[i][j]=resultado;
                System.out.print(resultado);
            }
        }
        System.out.println("");
        System.out.println(Arrays.toString(new int[]{array[1][2]}));

    }
}

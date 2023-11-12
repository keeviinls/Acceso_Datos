package UD1_ManejoDeExcepciones;

import java.util.Scanner;

public class Ejercicio_1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Creamos un array de 2 filas y 3 columnas.
        int[][] array = new int[2][3];

        //Hacemos un bucle para que vaya recorriendo el array individualmente.
        for (int i=0;i<array.length;i++){

            //Esto es simplemente para que ha la hora de ejecutar el programa se vea mas ordenado
            //hace que el array se divide en filas
            System.out.println("");

            //Hacemos otro bucle para que nuevamente lo recorra de 1 en 1
            for (int j=0;j<array[i].length;j++){

                //Creamos una variable que guardara el resultado, ese resultado sera la suma del valor I y del valor J
                //Por ejemplo el primero valdra 0 ya que tanto I como J valen 0, el segundo valdra 1 ya que I vale 0 pero J valdria 1
                    int resultado = i+j;

                    //Indicamos que ese resultado obtenido de las sumas lo almacenen dentro del array
                    array[i][j]=resultado;
                    //Simplemente imprimimos el array
                System.out.print(resultado);
            }
        }


    }
}

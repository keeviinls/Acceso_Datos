package UD1_1_RepasoJAVAejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //CREMOS LA VARIABLE DE NUMEROS Y LA DEL ARRAY, QUE TENDRA UN TAMÑAO DE 5
        int numeros = 0;
        int[] array_numeros = new int[5];

        //CON UN BUCLE FOR VAMOS RECORRIENDO EL ARRAY
        for (int i = 0; i<array_numeros.length;i++){

            //EN CADA ESPACIO DEL ARRAY VAMOS A IR PREGUNTANDO UN NUMERO Y EL USUARIO DEBERA ESCRIBIRLO, PROCEDEREMOS A GUARDARLO
            System.out.println("Dime un numero para el ESPACIO "+i);
            numeros = sc.nextInt();

            //ESE NUMERO ESCRITO POR EL USUARIO LO GUARDAREMOS EN EL ESPACIO DE ARRAY INDICADO
            array_numeros[i]=numeros;
        }

        //CREAMOS UNA FUNCION Y LA VINCULAMOS CON EL ARRAY, RECORDEMOS QUE EN ESTE MOMENTO EL ARRAY YA ESTARA RELLENADO
        double media = calcularMediaArray(array_numeros);


        //IMPRIMIMOS EL ARRAY Y MOSTRAMOS UN MENSAJE INDICANDO LA MEDIA
        System.out.println(Arrays.toString(array_numeros));
        System.out.println("Su media es "+media);
    }

    public static double calcularMediaArray(int[] array_numeros){
        //CREAMOS UNA VARIABLE DONDE GUARDAREMOS EL RESULTADO
        double resultado = 0;
        
        //RECORREMOS EL ARRAY DE 1 EN 1
        for (int i = 0;i<array_numeros.length;i++){

            //GUARDAMOS EN EL RESULTADO EL RESULTADO,QUE POR PRIMERA VEZ ES 0, Y LE SUMAMOS EL NUMERO QUE CONTENDRA EN ESE MOMENTO EL ARRAY
            resultado = resultado + array_numeros[i];
        }

        // EL RESULTADO CONTRA EL RESULTADO DE DIVIDIRLO SU NUMERO ENTRE 5
        resultado = resultado / 5;
        // HACEMOS UN RETURN PARA QUE LA FUNCION DEVUELVA SOLAMENTE EL RESULTADO FINAL
        return resultado;
    }
}

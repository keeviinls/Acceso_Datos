package UD1_1_RepasoJAVAejercicios;

import java.util.Arrays;

public class Ejercicio_8 {
    public static void main(String[] args) {

        //CREAMOS EL ARRAYLIST Y AÑADIMOS LAS MARCAS DE COCHES
        String[] marcas_coches = {"Ford", "Citroen", "Hyundai", "Renault", "Seat"};
        System.out.println(Arrays.toString(marcas_coches));

        //CREAMOS Y HACEMOS LLAMADA DE LA FUNCION pares
        pares(marcas_coches);
    }

    private static void pares(String[] marcas_coches) {
        System.out.println("Los elementos pares son: ");

        //CREAMOS UN BUCLE QUE RECORRA EL ARRAY Y EL VALOR VAYA SUBIENDO DE 2 EN 2
        for (int i=0;i<marcas_coches.length;i+=2){

            //IMPRIMIMOS LA POSICION Y EL NOMBRE DE LA MARCA DEL COCHE
            System.out.println("La posicion "+i+ " tiene el coche "+Arrays.toString(new String[]{marcas_coches[i]}));
        }
    }
}

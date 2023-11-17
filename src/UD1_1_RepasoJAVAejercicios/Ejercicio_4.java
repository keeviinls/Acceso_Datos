package UD1_1_RepasoJAVAejercicios;


import java.util.Scanner;

public class Ejercicio_4 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dime tu nota de clase del 0 al 10");    //PREGUNTAMOS AL USUARIO QUE DIGA SU NOTA DE CLASE
        int nota = sc.nextInt();    // CREAMOS LA VARIABLE NOTA Y USAMOS EL SCANNER PARA GUARDAR LO QUE ESCRIBA EL USUARIO

        //CREAMOS UN SWITCH QUE IRA ASOCIADO A LA NOTA QUE ESCRIBA EL USUARIO
        switch (nota){

            // EN EL CASO DE QUE LA NOTA SEA 0, MOSTRARA UN MENSAJE DE INSUFICIENTE, Y ASI CON CADA UNA DE LAS NOTAS
            case 0:
                System.out.println("Insuficiente");break;
            case 1:
                System.out.println("Insuficiente");break;
            case 2:
                System.out.println("Insuficiente");break;
            case 3:
                System.out.println("Insuficiente");break;
            case 4:
                System.out.println("Insuficiente");break;
            case 5:
                System.out.println("Suficiente");break;
            case 6:
                System.out.println("Bien");break;
            case 7:
                System.out.println("Notable");break;
            case 8:
                System.out.println("Notable");break;
            case 9:
                System.out.println("Sobresaliente");break;
            case 10:
                System.out.println("Sobresaliente");break;

            //EN EL CASO DE QUE EL USUARIO ESCRIBA UNA NOTA QUE NO ESTA EN EL RANGO, INDICARA QUE HAY UN ERROR.
            default:
                System.out.println("Error, nota incorrecta");break;
        };

    }
}

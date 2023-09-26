package Tema1_EjerciciosRepaso;


import java.util.Scanner;

public class Ejercicio_4 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dime tu nota de clase del 0 al 10");
        int nota = sc.nextInt();
        switch (nota){
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
            default:
                System.out.println("Error, nota incorrecta");break;
        };

    }
}

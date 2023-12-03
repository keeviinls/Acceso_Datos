package PRACTICAR_EXAMEN.Ejercicios_Exepciones_Practicar;

import java.util.Scanner;

public class ej4 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dime que nota has sacado");
        int nota_alumno = sc.nextInt();

        try {
            if (nota_alumno<5){
                throw new nota_suspensa("HAS SUSPENDIDO");
            }
            else {
                System.out.println("FELICIDADES HAS APROBADO");
            }
        }catch (nota_suspensa e){
            System.out.println("Error "+e.getMessage());
        }
        catch (Exception ex){
            System.out.println("Error, mete un numero del 1 al 10");
        }

    }

    private static class nota_suspensa extends Throwable {
        public nota_suspensa(String has_suspendido) {
            super(has_suspendido);
        }
    }
}

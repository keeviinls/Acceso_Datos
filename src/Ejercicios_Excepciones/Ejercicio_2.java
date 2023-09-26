package Ejercicios_Excepciones;

public class Ejercicio_2 {
    public static void main(String[] args) {

        try {
            int resultado;
            resultado = 5/0;
            System.out.println(resultado);
        }
        catch (ArithmeticException e){
            System.out.println("AritmeticExceotion: "+e.getMessage());
        }
    }
}

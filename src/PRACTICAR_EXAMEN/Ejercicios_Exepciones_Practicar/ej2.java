package PRACTICAR_EXAMEN.Ejercicios_Exepciones_Practicar;

public class ej2 {
    public static void main(String[] args) {
        int resultado;
        try {
            resultado = 5/0;
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println("ERROR HAS INTENTADO DIVIDIR POR 0");
        }

        System.out.println("Programa terminado");

    }
}

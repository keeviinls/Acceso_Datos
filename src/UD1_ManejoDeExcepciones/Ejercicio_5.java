package UD1_ManejoDeExcepciones;

public class Ejercicio_5 {
    public static void main(String[] args) {
        try {
             //Llamamos a la funcion
             funcionB();

            //Con el catch ejecutamos una Excepction
            } catch (Exception e) {

            //Imprimimos un mensaje indicando donde estamos
                System.out.println("Esto es del MAIN: " + e.getMessage());
            }
        }

        //Creamos la funcion B, vemos que tiene un throws Exception,
        // asi la funcionB puede usar las exepciones de Exception
        public static void funcionB() throws Exception {
            try {
                //Llamamos a la funcion
                funcionC();

            //Con el catch ejecutamos una Excepction
            } catch (Exception e) {

            //Imprimimos un mensaje indicando donde estamos
                System.out.println("ESTO ES DEL B " + e.getMessage());

            }
        }

        //Creamos la funcion C, vemos que tiene un throws Exception,
        //asi la funcionC puede usar las excepciones de Exception
        public static void funcionC() throws Exception {
            // Generamos una excepción y la propagamos
            throw new Exception("ESTO ES DEL C");
        }

}

package practica_de_procesos_CuentaBancaria;

public class Main_CuentaBancaria {
    public static void main(String[] args) throws InterruptedException{

        // Crear una instancia de la clase CuentaBancaria con un saldo inicial de 1000

        CuentaBancaria cuenta = new CuentaBancaria(1000);

        // Crear un hilo que incrementa el saldo en valores de 100
        IncrementarHilo hiloIncrementador = new IncrementarHilo(cuenta);

        // Crear un hilo que decrementa el saldo en valores de 150
        DecrementarHilo hiloDecrementador = new DecrementarHilo(cuenta);

        // Iniciar el hilo que incrementa el saldo
        hiloIncrementador.start();

        // Iniciar el hilo que decrementa el saldo
        hiloDecrementador.start();

        // Esperar a que el hilo que incrementa termine su ejecución
        hiloIncrementador.join();

        // Esperar a que el hilo que decrementa termine su ejecución
        hiloDecrementador.join();

        System.out.println("Saldo final: " + cuenta.consultarSaldo());

    }
}

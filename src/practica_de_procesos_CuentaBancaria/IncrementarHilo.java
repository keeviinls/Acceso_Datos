package practica_de_procesos_CuentaBancaria;

public class IncrementarHilo extends Thread{
    private CuentaBancaria cuenta;

    // Constructor que recibe la cuenta bancaria asociada al hilo
    public IncrementarHilo(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    // Método que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cuenta.ingreso(100);
        }
    }
}

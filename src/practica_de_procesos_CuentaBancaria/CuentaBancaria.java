package practica_de_procesos_CuentaBancaria;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CuentaBancaria {
    private double saldo;
    private final Lock lock = new ReentrantLock(); // Objeto Lock para garantizar exclusión mutua

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void ingreso(double cantidad) {
        lock.lock();  // Bloquear el acceso a la sección crítica  // Si el bloqueo ya está siendo utilizado por otro hilo, el hilo actual se bloqueará hasta que el bloqueo esté disponible.
        try {
            saldo += cantidad;
            System.out.println("Ingreso de " + cantidad + " realizado. Saldo actual: " + saldo);
        } catch (Exception e){
            lock.unlock(); // Desbloquear incluso si ocurre una excepción
        }
    }

    public void retirar(double cantidad) {
        lock.lock(); // Bloquear el acceso a la sección crítica
        try {
            if (saldo >= cantidad) {
                saldo -= cantidad;
                System.out.println("Retiro de " + cantidad + " realizado. Saldo actual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente para realizar el retiro de " + cantidad);
            }
        } finally {
            lock.unlock(); // Desbloquear incluso si ocurre una excepción
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}

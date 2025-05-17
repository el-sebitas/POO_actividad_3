package Ejercicio_4_1;

public class Cuenta {
    protected float saldo;
    protected int n_consignaciones;
    protected int n_retiros;
    protected float tasa_anual;
    protected float comision_mensual;

    public Cuenta(float saldo, float tasa_anual) {
        this.saldo = saldo;
        this.tasa_anual = tasa_anual;
        this.n_consignaciones = 0;
        this.n_retiros = 0;
        this.comision_mensual = 0;
    }

    void consignar(float valor) {
        this.saldo += valor;
        this.n_consignaciones += 1;
    }

    void retirar(float valor) {
        if (valor > this.saldo) {
            System.out.println("No es posible retirar el valor");
        } else {
            this.saldo -= valor;
            this.n_retiros += 1;
        }
    }

    void calcularTasaMensual() {
        float tasa_mensual = this.tasa_anual / 12;
        this.saldo += this.saldo * tasa_mensual;
    }

    void extractoMensual() {
        this.saldo -= this.comision_mensual;
        calcularTasaMensual();
    }

    void imprimir() {
        System.out.println("Saldo: $" + this.saldo);
        System.out.println("Numero de consignaciones: " + this.n_consignaciones);
        System.out.println("Numero de retiros: " + this.n_retiros);
        System.out.println("Tasa anual: " + this.tasa_anual);
        System.out.println("Comision mensual: " + this.comision_mensual);
    }
}

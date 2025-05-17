package Ejercicio_4_1;

public class Corriente extends Cuenta{
    protected float sobregiro;

    public Corriente(float saldo, float tasa_anual) {
        super(saldo, tasa_anual);
        this.sobregiro = 0;
    }

    @Override
    void retirar(float valor) {
        if (valor > this.saldo) {
            this.sobregiro = valor - this.saldo;
            this.saldo = 0;
        } else {
            this.saldo -= valor;
        }
        this.n_retiros += 1;
    }

    @Override
    void consignar(float valor) {
        float residuo = this.sobregiro - valor;
        if (residuo > 0) {
            this.sobregiro = residuo;
        } else {
            residuo *= -1;
            super.consignar(residuo);
        }
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Sobregiro: " + this.sobregiro);
    }
}

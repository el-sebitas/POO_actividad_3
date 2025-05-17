package Ejercicio_4_1;

public class Ahorros extends Cuenta{
    boolean activa;

    public Ahorros(float saldo, float tasa_anual) {
        super(saldo, tasa_anual);

        if (this.saldo < 10000) {
            this.activa = false;
        } else {
            this.activa = true;
        }
    }

    @Override
    void consignar(float valor) {
        if (activa) {
            super.consignar(valor);
        }
    }

    @Override
    void retirar(float valor) {
        if (activa) {
            super.retirar(valor);
        }
    }

    @Override
    void extractoMensual() {
        if (this.n_retiros > 4) {
            this.comision_mensual = 1000;
            super.extractoMensual();
        }

        if (this.saldo < 10000) {
            this.activa = false;
        }
    }

    @Override
    void imprimir() {
        super.imprimir();
        if (this.activa) {
            System.out.println("Estado de cuenta: ACTIVA");
        } else {
            System.out.println("Estado de cuenta: DESACTIVA");
        }
    }
}

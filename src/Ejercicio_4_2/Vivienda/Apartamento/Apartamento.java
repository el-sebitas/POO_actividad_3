package Ejercicio_4_2.Vivienda.Apartamento;

import Ejercicio_4_2.Vivienda.Vivienda;

public abstract class Apartamento extends Vivienda {
    public Apartamento(int area, String direccion, int id, double val_inmueble, int n_habitaciones, int n_baños) {
        super(area, direccion, id, val_inmueble, n_habitaciones, n_baños);
    }

    protected abstract void valor();

    @Override
    protected void imprimir() {
        super.imprimir();
    }
}

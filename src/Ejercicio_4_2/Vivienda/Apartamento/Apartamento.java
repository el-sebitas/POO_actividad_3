package Ejercicio_4_2.Vivienda.Apartamento;

import Ejercicio_4_2.Vivienda.Vivienda;

public abstract class Apartamento extends Vivienda {
    public Apartamento(int area, String direccion, int id, int n_habitaciones, int n_baños) {
        super(area, direccion, id, n_habitaciones, n_baños);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
}

package Ejercicio_4_2.Vivienda.Casa;

import Ejercicio_4_2.Vivienda.Vivienda;

public abstract class Casa extends Vivienda {
    protected int n_pisos;

    public Casa(int area, String direccion, int id, double val_inmueble, int n_habitaciones, int n_baños, int n_pisos) {
        super(area, direccion, id, val_inmueble, n_habitaciones, n_baños);
        this.n_pisos = n_pisos;
    }

    protected abstract void valor();
}

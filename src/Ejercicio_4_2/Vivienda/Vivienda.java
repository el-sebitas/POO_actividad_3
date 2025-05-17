package Ejercicio_4_2.Vivienda;

import Ejercicio_4_2.Inmueble;

public class Vivienda extends Inmueble {
    protected int n_habitaciones;
    protected int n_baños;

    public Vivienda(int area, String direccion, int id, double val_inmueble, int n_habitaciones, int n_baños) {
        super(area, direccion, id, val_inmueble);
        this.n_habitaciones = n_habitaciones;
        this.n_baños = n_baños;
    }
}

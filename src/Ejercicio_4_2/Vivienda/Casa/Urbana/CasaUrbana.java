package Ejercicio_4_2.Vivienda.Casa.Urbana;

import Ejercicio_4_2.Vivienda.Casa.Casa;

public class CasaUrbana extends Casa {
    public CasaUrbana(int area, String direccion, int id, double val_inmueble, int n_habitaciones, int n_baños, int n_pisos) {
        super(area, direccion, id, val_inmueble, n_habitaciones, n_baños, n_pisos);
    }

    @Override
    protected void valor() {

    }

    @Override
    protected void imprimir() {
        super.imprimir();
    }
}

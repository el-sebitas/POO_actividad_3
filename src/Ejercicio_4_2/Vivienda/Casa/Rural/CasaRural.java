package Ejercicio_4_2.Vivienda.Casa.Rural;

import Ejercicio_4_2.Vivienda.Casa.Casa;

public class CasaRural extends Casa {
    int dist_cabecera_municipal;
    int altitud;

    public CasaRural(int area, String direccion, int id, double val_inmueble, int n_habitaciones, int n_baños, int n_pisos, int dist_cabecera_municipal) {
        super(area, direccion, id, val_inmueble, n_habitaciones, n_baños, n_pisos);
        this.dist_cabecera_municipal = dist_cabecera_municipal;
    }

    void valor() {
        this.val_inmueble = this.area * 1500000;
    }
}

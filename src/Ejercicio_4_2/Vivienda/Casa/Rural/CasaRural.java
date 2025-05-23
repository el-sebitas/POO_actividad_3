package Ejercicio_4_2.Vivienda.Casa.Rural;

import Ejercicio_4_2.Vivienda.Casa.Casa;

public class CasaRural extends Casa {
    int dist_cabecera_municipal;
    int altitud;
    public double valor = 1500000;

    public CasaRural(int area, String direccion, int id, int n_habitaciones, int n_baños, int n_pisos, int dist_cabecera_municipal) {
        super(area, direccion, id, n_habitaciones, n_baños, n_pisos);
        this.dist_cabecera_municipal = dist_cabecera_municipal;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Distancia de la cabecera municipal: " + dist_cabecera_municipal);
        System.out.println("Altura sobre el nivel del mar: " + altitud);
    }
}

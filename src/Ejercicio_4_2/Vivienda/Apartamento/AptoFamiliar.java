package Ejercicio_4_2.Vivienda.Apartamento;

import Ejercicio_4_2.Vivienda.Vivienda;

public class AptoFamiliar extends Apartamento {
    protected double valor_administracion;

    public AptoFamiliar(int area, String direccion, int id, double val_inmueble, int n_habitaciones, int n_baños, double valor_administracion) {
        super(area, direccion, id, val_inmueble, n_habitaciones, n_baños);
        this.valor_administracion = valor_administracion;
    }

    void valor() {
        this.val_inmueble = this.area * 2000000;
    }
}

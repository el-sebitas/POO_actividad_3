package Ejercicio_4_2.Local;

import Ejercicio_4_2.Inmueble;

public abstract class Local extends Inmueble {
    protected enum localizacion {INTERNO, CALLE} localizacion localizacion;

    public Local(int area, String direccion, int id, localizacion localizacion) {
        super(area, direccion, id);
        this.localizacion = localizacion;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Localizacion: " + localizacion);
    }
}

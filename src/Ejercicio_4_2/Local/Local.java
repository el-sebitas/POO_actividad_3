package Ejercicio_4_2.Local;

import Ejercicio_4_2.Inmueble;

public abstract class Local extends Inmueble {
    protected enum localizacion {INTERNO, CALLE} localizacion localizacion;

    public Local(int area, String direccion, int id, double val_inmueble, localizacion localizacion) {
        super(area, direccion, id, val_inmueble);
        this.localizacion = localizacion;
    }

    protected abstract void valor();

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Localizacion: " + localizacion);
    }
}

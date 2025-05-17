package Ejercicio_4_2.Local;

import Ejercicio_4_2.Inmueble;

public class Local extends Inmueble {
    enum localizacion {INTERNO, CALLE} localizacion localizacion;

    public Local(int area, String direccion, int id, double val_inmueble, localizacion localizacion) {
        super(area, direccion, id, val_inmueble);
        this.localizacion = localizacion;
    }
}

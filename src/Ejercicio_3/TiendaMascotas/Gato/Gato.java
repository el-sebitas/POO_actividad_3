package Ejercicio_3.TiendaMascotas.Gato;

import Ejercicio_3.TiendaMascotas.Mascota;

public class Gato extends Mascota {
    public Gato(String color, int edad, String nombre) {
        super(color, edad, nombre);
    }

    static void sonido() {
        System.out.println("Los gatos maúllan y ronronean");
    }
}

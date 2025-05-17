package Ejercicio_3.TiendaMascotas.Perro;

import Ejercicio_3.TiendaMascotas.Mascota;

public class Perro extends Mascota {

    public Perro(String color, int edad, String nombre) {
        super(color, edad, nombre);
    }

    static void sonido() {
        System.out.println("Los perros ladran");
    }
}

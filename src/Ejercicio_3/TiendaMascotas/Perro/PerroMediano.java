package Ejercicio_3.TiendaMascotas.Perro;

public class PerroMediano extends Perro {
    enum raza {collie, dálmata, bulldog, galgo, sabueso} raza raza;

    public PerroMediano(String color, int edad, String nombre, raza raza) {
        super(color, edad, nombre);
        this.raza = raza;
    }
}

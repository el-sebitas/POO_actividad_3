package Ejercicio_3.TiendaMascotas.Perro;

public class PerroGrande extends Perro {
    enum raza {pastor_alemán, doberman, rotweiller} raza raza;

    public PerroGrande(String color, int edad, String nombre, raza raza) {
        super(color, edad, nombre);
        this.raza = raza;
    }
}

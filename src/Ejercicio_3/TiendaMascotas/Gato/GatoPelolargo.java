package Ejercicio_3.TiendaMascotas.Gato;

public class GatoPelolargo extends Gato {
    enum raza {angora, himalayo, balinés, somalí} raza raza;

    public GatoPelolargo(String color, int edad, String nombre, raza raza) {
        super(color, edad, nombre);
        this.raza = raza;
    }
}

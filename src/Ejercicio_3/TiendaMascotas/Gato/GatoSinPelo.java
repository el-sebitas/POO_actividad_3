package Ejercicio_3.TiendaMascotas.Gato;

public class GatoSinPelo extends Gato {
    enum raza {esfinge, elfo, donskoy} raza raza;

    public GatoSinPelo(String color, int edad, String nombre, raza raza) {
        super(color, edad, nombre);
        this.raza = raza;
    }
}

package Ejercicio_3.TiendaMascotas.Gato;

public class GatoPeloCorto extends Gato {
    public enum raza {azul_ruso, británico,manx, devon_rex} raza raza;

    public GatoPeloCorto(String color, int edad, String nombre, raza raza) {
        super(color, edad, nombre);
        this.raza = raza;
    }
}

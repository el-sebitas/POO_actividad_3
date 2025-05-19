package Ejercicio_3.TiendaMascotas.Perro;

public class PerroPequeño extends Perro {
    public enum raza {caniche, yorkshire_terrier, schnauzer, chihuahua} raza raza;

    public PerroPequeño(String color, int edad, String nombre, raza raza) {
        super(color, edad, nombre);
        this.raza = raza;
    }
}

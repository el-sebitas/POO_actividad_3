package Ejercicio_3.TiendaMascotas;

public class Mascota {
    protected String nombre;
    protected int edad;
    protected String color;

    public Mascota(String color, int edad, String nombre) {
        this.color = color;
        this.edad = edad;
        this.nombre = nombre;
    }

    protected void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Color: " + color);
    }
}

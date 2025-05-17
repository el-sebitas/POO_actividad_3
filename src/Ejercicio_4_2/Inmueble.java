package Ejercicio_4_2;

public class Inmueble {
    protected int id;
    protected int area;
    protected String direccion;
    protected double val_inmueble;

    public Inmueble(int area, String direccion, int id, double val_inmueble) {
        this.area = area;
        this.direccion = direccion;
        this.id = id;
        this.val_inmueble = val_inmueble;
    }
}

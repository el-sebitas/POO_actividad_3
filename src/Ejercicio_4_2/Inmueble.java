package Ejercicio_4_2;

public abstract class Inmueble {
    protected int id;
    protected int area;
    protected String direccion;
    protected double val_inmueble;

    public Inmueble(int area, String direccion, int id) {
        this.area = area;
        this.direccion = direccion;
        this.id = id;
        this.val_inmueble = val_inmueble;
    }

    public void imprimir() {
        System.out.println("Identificador inmobiliario: " + id);
        System.out.println("Area: " + area);
        System.out.println("Direccion: " + direccion);
        System.out.println("Valor de inmueble: $" + val_inmueble);
    }

    protected void valor(double val_area) {
        this.val_inmueble = this.area * val_area;
    }
}

package Ejercicio_4_2.Local;

public class Oficina extends Local{
    protected boolean gobierno;
    public double valor = 3500000;

    public Oficina(int area, String direccion, int id, localizacion localizacion, boolean gobierno) {
        super(area, direccion, id, localizacion);
        this.gobierno = gobierno;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Gobierno: " + gobierno);
    }
}

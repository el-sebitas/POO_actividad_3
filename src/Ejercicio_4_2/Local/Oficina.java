package Ejercicio_4_2.Local;

public class Oficina extends Local{
    protected boolean gobierno;

    public Oficina(int area, String direccion, int id, double val_inmueble, localizacion localizacion, boolean gobierno) {
        super(area, direccion, id, val_inmueble, localizacion);
        this.gobierno = gobierno;
    }

//    void valor() {
//        this.val_inmueble = this.area * 3500000;
//    }

    @Override
    protected void valor() {
        super.valor(3500000);
    }

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Gobierno: " + gobierno);
    }
}

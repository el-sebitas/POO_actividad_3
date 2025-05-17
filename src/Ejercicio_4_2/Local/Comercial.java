package Ejercicio_4_2.Local;

public class Comercial extends Local{
    protected String centro_comercial;

    public Comercial(int area, String direccion, int id, double val_inmueble, localizacion localizacion, String centro_comercial) {
        super(area, direccion, id, val_inmueble, localizacion);
        this.centro_comercial = centro_comercial;
    }

//    void valor() {
//        this.val_inmueble = this.area * 3000000;
//    }

    @Override
    protected void valor() {
        super.valor(3000000);
    }

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial: " + centro_comercial);
    }
}

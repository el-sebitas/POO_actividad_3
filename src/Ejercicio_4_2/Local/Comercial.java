package Ejercicio_4_2.Local;

public class Comercial extends Local{
    protected String centro_comercial;
    public double valor = 3000000;

    public Comercial(int area, String direccion, int id, localizacion localizacion, String centro_comercial) {
        super(area, direccion, id, localizacion);
        this.centro_comercial = centro_comercial;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial: " + centro_comercial);
    }
}

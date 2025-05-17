package Ejercicio_4_2.Vivienda.Casa.Urbana;

public class CasaIndependiente extends CasaUrbana{
    public CasaIndependiente(int area, String direccion, int id, double val_inmueble, int n_habitaciones, int n_baños, int n_pisos) {
        super(area, direccion, id, val_inmueble, n_habitaciones, n_baños, n_pisos);
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
    }
}

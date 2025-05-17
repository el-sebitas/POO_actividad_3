package Ejercicio_4_2.Vivienda.Apartamento;

public class AptoEstudio extends Apartamento {
    public AptoEstudio(int area, String direccion, int id, double val_inmueble, int n_baños) {
        super(area, direccion, id, val_inmueble, 1, n_baños);
    }

//    void valor() {
//        this.val_inmueble = this.area * 1500000;
//    }

    @Override
    protected void valor() {
        super.valor(1500000);
    }

    @Override
    protected void imprimir() {
        super.imprimir();
    }
}

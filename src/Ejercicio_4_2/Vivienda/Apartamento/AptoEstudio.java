package Ejercicio_4_2.Vivienda.Apartamento;

public class AptoEstudio extends Apartamento {
    public double valor = 1500000;

    public AptoEstudio(int area, String direccion, int id, int n_baños) {
        super(area, direccion, id, 1, n_baños);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
}

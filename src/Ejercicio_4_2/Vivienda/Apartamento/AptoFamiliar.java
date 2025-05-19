package Ejercicio_4_2.Vivienda.Apartamento;

public class AptoFamiliar extends Apartamento {
    protected double valor_administracion;
    public double valor = 2000000;

    public AptoFamiliar(int area, String direccion, int id, int n_habitaciones, int n_baños, double valor_administracion) {
        super(area, direccion, id, n_habitaciones, n_baños);
        this.valor_administracion = valor_administracion;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor administracion: " + valor_administracion);
    }
}

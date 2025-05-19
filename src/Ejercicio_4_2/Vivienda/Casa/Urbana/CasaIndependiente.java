package Ejercicio_4_2.Vivienda.Casa.Urbana;

public class CasaIndependiente extends CasaUrbana{
    public double valor = 3000000;

    public CasaIndependiente(int area, String direccion, int id, int n_habitaciones, int n_baños, int n_pisos) {
        super(area, direccion, id, n_habitaciones, n_baños, n_pisos);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
}

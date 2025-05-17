package Ejercicio_4_2.Vivienda.Casa.Urbana;

public class CasaCerrada extends CasaUrbana{
    protected double valor_administracion;
    protected boolean areas_no_comunes;

    public CasaCerrada(int area, String direccion, int id, double val_inmueble, int n_habitaciones, int n_baños, int n_pisos, double valor_administracion, boolean areas_no_comunes) {
        super(area, direccion, id, val_inmueble, n_habitaciones, n_baños, n_pisos);
        this.valor_administracion = valor_administracion;
        this.areas_no_comunes = areas_no_comunes;
    }

//    void valor() {
//        this.val_inmueble = this.area * 2500000;
//    }

    @Override
    protected void valor() {
        super.valor(2500000);
    }

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Valor de administracion: " + valor_administracion);
        System.out.println("Areas no cmunes: " + areas_no_comunes);
    }
}

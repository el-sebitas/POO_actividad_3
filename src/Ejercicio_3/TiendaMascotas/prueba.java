package Ejercicio_3.TiendaMascotas;

import Ejercicio_3.TiendaMascotas.Gato.Gato;
import Ejercicio_3.TiendaMascotas.Gato.GatoPeloCorto;
import Ejercicio_3.TiendaMascotas.Perro.Perro;
import Ejercicio_3.TiendaMascotas.Perro.PerroMediano;

import java.util.Scanner;

public class prueba {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Gato gato = new GatoPeloCorto("azul",7, "gato molesto", GatoPeloCorto.raza.británico);

        gato.imprimir();
        Gato.sonido();

        Perro perro = new PerroMediano("Negro", 11, "princesa", PerroMediano.raza.dálmata);

        perro.imprimir();
        Perro.sonido();
    }
}

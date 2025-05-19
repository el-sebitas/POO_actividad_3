package Ejercicio_4_2;
import Ejercicio_4_2.Vivienda.Apartamento.AptoEstudio;
import Ejercicio_4_2.Vivienda.Apartamento.AptoFamiliar;

import java.util.Scanner;

public class Prueba {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        AptoFamiliar apto1 = new AptoFamiliar(120, "Avenida Santander 45-45", 103067, 3, 2, 200000);
        System.out.println("Datos apartamento");
        apto1.valor(apto1.valor);
        apto1.imprimir();
        System.out.println("Datos apartamento");
        AptoEstudio aptestudio1 = new AptoEstudio(50,"Avenida Caracas 30-15",12354,1);
        aptestudio1.valor(aptestudio1.valor);
        aptestudio1.imprimir();
    }
}

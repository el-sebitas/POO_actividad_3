package Ejercicio_4_1;

import java.util.Scanner;

public class Prueba {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuenta Ahorros");
        System.out.print("Ingrese saldo inicial: $");
        float saldo = sc.nextFloat();
        System.out.print("Ingrese la tasa: ");
        float tasa = sc.nextFloat();
        Cuenta cuenta1 = new Ahorros(saldo, tasa);
        System.out.print("Ingrese cantidad a consignar : $");
        float valor = sc.nextFloat();
        cuenta1.consignar(valor);
        System.out.print("Ingresa cantidad a retirar: $");
        valor = sc.nextFloat();
        cuenta1.retirar(valor);
        cuenta1.calcularTasaMensual();
        cuenta1.imprimir();
    }
}

//100000
//        0,10
//        50000
//        70000
package Ejercicio_4;

public class Prueba {
    public static void main(String args[]) {
        Estudiante p1 = new Estudiante("itagui", "Sebas", "cs", 4);
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Direccion: " + p1.getDireccion());
        System.out.println("Carrera: " + p1.getCarrera());
        System.out.println("Semestre: " + p1.getSemestre());
    }
}

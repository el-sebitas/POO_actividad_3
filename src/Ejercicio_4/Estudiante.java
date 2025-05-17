package Ejercicio_4;

public class Estudiante extends Persona{
    protected String carrera;
    protected int semestre;

    public Estudiante(String direccion, String nombre, String carrera, int semestre) {
        super(direccion, nombre);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}

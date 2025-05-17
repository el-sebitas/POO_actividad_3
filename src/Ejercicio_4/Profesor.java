package Ejercicio_4;

public class Profesor extends Persona {
    protected String departamento;
    protected String categoria;

    public Profesor(String direccion, String nombre, String departamento, String categoria) {
        super(direccion, nombre);
        this.departamento = departamento;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

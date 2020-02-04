package h_empleado;

public abstract class Empleado {

    private String nombre;
    private String apellido;
    private int ci;

    public Empleado(String nombre, String apellido, int ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public abstract double Calcular_Ingresos();
}

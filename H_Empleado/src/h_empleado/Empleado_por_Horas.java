package h_empleado;

public class Empleado_por_Horas extends Empleado {

    double horas;
    double sueldo;

    public Empleado_por_Horas(double sueldo, double horas, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public Empleado_por_Horas(double sueldo, double horas) {
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public double Calcular_Ingresos() {
        if (sueldo < 0) {
            this.sueldo = 0;
        }
        if (horas < 0 || horas > 168) {
            this.horas = 0;
        }
        return (this.horas * this.sueldo);
    }

    @Override
    public String toString() {
        return "NOMBRE: " + getNombre() + " APELLIDO " + getApellido() + " CI: " + getCi() + " SALARIO TOTAL: " + Calcular_Ingresos();
    }
}

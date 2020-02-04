package h_empleado;

public class EmpleadAsalariado extends Empleado {

    double SalarioSemanal;

    public EmpleadAsalariado(double SalarioSemanal, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.SalarioSemanal = SalarioSemanal;
    }

    public EmpleadAsalariado(double SalarioSemanal) {
        this.SalarioSemanal = SalarioSemanal;
    }

    public double getSalarioSemanal() {
        return SalarioSemanal;
    }

    public void setSalarioSemanal(double SalarioSemanal) {
        this.SalarioSemanal = SalarioSemanal;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + getNombre() + " APELLIDO: " + getApellido() + " CI: " + getCi() + " SALARIO SEMANAL: " + Calcular_Ingresos();
    }

    @Override
    public double Calcular_Ingresos() {
        if (SalarioSemanal < 0) {
            this.SalarioSemanal = 0;
        }
        return (this.SalarioSemanal * 4);
    }
}

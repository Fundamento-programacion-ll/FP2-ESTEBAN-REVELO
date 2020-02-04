package h_empleado;

public class EmpleadoBaseMasComision extends Empleado_por_Comisión {

    double SalarioBase;

    public EmpleadoBaseMasComision(double SalarioBase, double Ventas_Brutas, double Tarifa_Comision, String nombre, String apellido, int ci) {
        super(Ventas_Brutas, Tarifa_Comision, nombre, apellido, ci);
        this.SalarioBase = SalarioBase;
    }

    public EmpleadoBaseMasComision(double SalarioBase, double Ventas_Brutas, double Tarifa_Comision) {
        super(Ventas_Brutas, Tarifa_Comision);
        this.SalarioBase = SalarioBase;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    @Override
    public String toString() {
        if (SalarioBase < 0) {
            SalarioBase = 0;
        }
        return "NOMBRE: " + getNombre() + " APELLIDO " + getApellido() + " CI: " + getCi() + " SALARIO TOTAL " + (this.SalarioBase + super.Calcular_Ingresos());
    }
}

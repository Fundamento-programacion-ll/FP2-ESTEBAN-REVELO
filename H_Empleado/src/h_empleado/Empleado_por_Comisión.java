package h_empleado;

public class Empleado_por_Comisión extends Empleado {

    private double Ventas_Brutas;
    private double Tarifa_Comision;

    public Empleado_por_Comisión(double Ventas_Brutas, double Tarifa_Comision, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.Ventas_Brutas = Ventas_Brutas;
        this.Tarifa_Comision = Tarifa_Comision;
    }

    public Empleado_por_Comisión(double Ventas_Brutas, double Tarifa_Comision) {
        this.Ventas_Brutas = Ventas_Brutas;
        this.Tarifa_Comision = Tarifa_Comision;
    }

    public double getVentas_Brutas() {
        return Ventas_Brutas;
    }

    public double getTarifa_Comision() {
        return Tarifa_Comision;
    }

    public void setVentas_Brutas(double Ventas_Brutas) {
        this.Ventas_Brutas = Ventas_Brutas;
    }

    public void setTarifa_Comision(double Tarifa_Comision) {
        this.Tarifa_Comision = Tarifa_Comision;
    }

    @Override
    public double Calcular_Ingresos() {
        if (Tarifa_Comision <= 0) {
            this.Tarifa_Comision = 0;
        }
        if (Ventas_Brutas <= 0) {
            this.Ventas_Brutas = 0;
        }
        return (this.Tarifa_Comision * this.Ventas_Brutas);
    }

    @Override
    public String toString() {
        return "NOMBRE: " + getNombre() + " APELLIDO: " + getApellido() + " CI: " + getCi() + " SALARIO TOTAL " + Calcular_Ingresos();
    }
}

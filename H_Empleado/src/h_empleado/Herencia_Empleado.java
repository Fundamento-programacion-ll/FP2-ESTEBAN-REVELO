package h_empleado;

public class Herencia_Empleado {

    public static void main(String[] args) {
        EmpleadAsalariado ea = new EmpleadAsalariado(15.5, "Esteban", "Revelo", 1003982269);
        System.out.println(ea);
        Empleado_por_Comisión ec = new Empleado_por_Comisión(100, -1, "Esteban", "Revelo", 1003982269);
        System.out.println(ec);
        Empleado_por_Horas eh = new Empleado_por_Horas(10, 100, "Esteban", "Revelo", 1003982269);
        System.out.println(eh);
        EmpleadoBaseMasComision ebc = new EmpleadoBaseMasComision(10, 10, 10, "Esteban", "Revelo", 1003982269);
        System.out.println(ebc);
    }
}
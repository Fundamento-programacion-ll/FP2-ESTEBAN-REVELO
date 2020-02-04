package dimensiones;

import javax.swing.JOptionPane;

public class Triangulo extends Dimensiones {

    private double AreaBase;

    public double getAreaBase() {
        return AreaBase;
    }

    public void setAreaBase(double AreaBase) {
        this.AreaBase = AreaBase;
    }

    public Triangulo(double AreaBase, double lados, double base, double altura) {
        super(lados, base, altura);
        this.AreaBase = AreaBase;
    }

    public Triangulo(double AreaBase) {
        this.AreaBase = AreaBase;
    }

    public Triangulo() {
    }

    public void Area() {
        Double total = (getBase() * getAltura()) / 2;
        JOptionPane.showMessageDialog(null, "AREA:\n" + total, "RESULTADO", 1);
    }

    public void Volumen() {
        double total = (AreaBase * getAltura()) / 3;
        JOptionPane.showMessageDialog(null, "VOLUMEN:\n" + total, "RESULTADO", 1);
    }

    public void Perimetro() {
        JOptionPane.showMessageDialog(null, "PERIMETRO:\n" + getLados(), "RESULTADO", 1);
    }
}

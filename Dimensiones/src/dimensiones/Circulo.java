package dimensiones;

import javax.swing.JOptionPane;

public class Circulo {

    private double radio;
    double total;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void Circunferencia() {
        total = 2 * Math.PI * getRadio();
        JOptionPane.showMessageDialog(null, "CIRCUNFERENCIA:\n" + total, "RESULTADO", 1);
    }
}

package dimensiones;

import javax.swing.JOptionPane;

public class Cuadrado extends Dimensiones {

    double total;

    public Cuadrado(double base, double lados, double altura) {
        super(base, lados, altura);
    }

    public void Area() {
        total = getLados() * getLados();
        JOptionPane.showMessageDialog(null, "ÁRREA:\n" + total, "RESULTADO", 1);
    }

    public void Volumen() {
        total = getLados() * getLados() * getLados();
        JOptionPane.showMessageDialog(null, "VOLUMEN:\n" + total, "RESULTADO", 1);
    }

    public void Perimetro() {
        total = getLados() * 4;
        JOptionPane.showMessageDialog(null, "PERIMETRO:\n" + total, "RESULTADO", 1);
    }
}

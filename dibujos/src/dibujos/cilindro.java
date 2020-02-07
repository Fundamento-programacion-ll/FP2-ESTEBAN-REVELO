package dibujos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class cilindro extends circulo {

    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public cilindro(int x, int y, double radio, double altura) {
        super(x, y, radio);
        this.altura = altura;
    }

    public cilindro() {
        super();
        this.altura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del cilindro"));
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillOval(
                getX(),
                (int) (getY() + this.altura),
                (int) super.getRadio(),
                (int) super.getRadio());
        g.setColor(Color.RED);
        g.drawLine(
                (int) (super.getX() + super.getRadio()),
                (int) (super.getY() + (super.getRadio() / 2)),
                (int) (super.getX() + super.getRadio()),
                (int) (super.getY() + this.altura + super.getRadio() - (super.getRadio() / 2)));
        g.drawLine(
                (int) (getX()),
                (int) (super.getY() + (super.getRadio() / 2)),
                (int) (super.getX()),
                (int) (super.getY() + this.altura + super.getRadio() - (super.getRadio() / 2)));
    }

    @Override
    public String toString() {
        return "\nCilindro" + " \nAltura= " + this.altura + super.toString();
    }
}

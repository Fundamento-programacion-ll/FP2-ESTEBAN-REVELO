package dibujos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class punto extends figura {

    private int x;
    private int y;

    public punto() {
        super();
        String datos;
        datos = JOptionPane.showInputDialog("ingrese las coordenadas x,y separados con coma");
        StringTokenizer tokens = new StringTokenizer(datos, ",");
        this.x = Integer.parseInt(tokens.nextToken());
        this.y = Integer.parseInt(tokens.nextToken());
    }

    public punto(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(this.x, this.y, 30, 30);
    }

    @Override
    public String toString() {
        return "\nPunto [x= " + this.x + ", y= " + this.y + ']';
    }

    @Override
    public double getArea() {
        return 0;
    }
}

package dibujos;

import java.awt.Color;
import java.awt.Graphics;

public class CUADRADO extends punto {

    private int lado;

    public CUADRADO() {
        this.lado = 300;
    }

    public CUADRADO(int lado, int x, int y) {
        super(x, y);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void paint(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.drawRect(lado, lado, lado, lado);

    }
}

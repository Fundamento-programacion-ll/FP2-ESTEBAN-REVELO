package dibujos;

import java.awt.Graphics;

public class circulo extends punto {

    private int radio;

    public circulo() {
    }

    public circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public void dibujo(Graphics g) {
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    
    
    
    
    
    
    
    
    
}

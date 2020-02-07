package dibujos;

import java.awt.Canvas;
import java.awt.Graphics;

public abstract class figura extends Canvas {

    public abstract void paint(Graphics g);

    public abstract double getArea();
}

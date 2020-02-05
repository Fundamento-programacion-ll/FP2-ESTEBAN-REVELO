package dibujos;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dibujos {

    public static void main(String[] args) {
        punto pto = new punto();
        JFrame ventana = new JFrame();
        ventana.add(pto);
        ventana.setSize(700, 400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

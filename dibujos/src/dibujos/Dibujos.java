package dibujos;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dibujos {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        JFrame ventana = new JFrame();
        String input = JOptionPane.showInputDialog(null, "Ingreser la opcion a dibujar: punto, circulo");
        if (input.equalsIgnoreCase("punto")) {
            punto pto = new punto();
            ventana.add(pto);
            ventana.setSize(700, 400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (input.equalsIgnoreCase("circulo")) {
            circulo circle = new circulo();
            System.out.println(circle);
            ventana.add(circle);
            ventana.setSize(700, 400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
            cilindro cilind = new cilindro();
            ventana.add(cilind);
            ventana.setSize(700, 400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(null, "Opcion no encontrada");
        }
    }
}

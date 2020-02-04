package dimensiones;

import javax.swing.JOptionPane;

public class D_Dimensiones {

    public static void main(String[] args) {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1. TRIANGULO \n2. CUADRADO \n3. CIRCULO"));
        switch (op) {
            case 1:
                int opT = Integer.parseInt(JOptionPane.showInputDialog(null, "1. AREA \n2. VOLUMEN \n3. PERIMETRO"));
                switch (opT) {
                    case 1:
                        double base = Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA BASE"));
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA ALTURA"));
                        Triangulo triA = new Triangulo(0, 0, base, altura);
                        triA.Area();
                        break;
                    case 2:
                        double Abase = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL AREA DE LA BASE"));
                        double alturaVolumen = Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA ALTURA"));
                        Triangulo triVol = new Triangulo(Abase, 0, 0, alturaVolumen);
                        triVol.Volumen();
                        break;
                    case 3:
                        double Lados[] = new double[3];
                        for (int i = 0; i < 3; i++) {
                            Lados[i] = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL " + (i + 1) + " LADO DEL TRIANGULO"));
                        }
                        Double Perimetro = Lados[0] + Lados[1] + Lados[2];
                        Triangulo triPer = new Triangulo(0, Perimetro, 0, 0);
                        triPer.Perimetro();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION INGRESADA NO VALIDA", "ERROR", 0);
                        break;
                }
                break;
            case 2:
                int opCuadrado = Integer.parseInt(JOptionPane.showInputDialog(null, "1. AREA \n2. VOLUMEN \n3. PERIMETRO"));
                switch (opCuadrado) {
                    case 1:
                        double lado = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN LADO"));
                        Cuadrado AreaC = new Cuadrado(lado, 0, 0);
                        AreaC.Area();
                        break;
                    case 2:
                        double ladoV = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN LADO"));
                        Cuadrado VolC = new Cuadrado(ladoV, 0, 0);
                        VolC.Volumen();
                        break;
                    case 3:
                        double ladoP = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN LADO"));
                        Cuadrado PerC = new Cuadrado(ladoP, 0, 0);
                        PerC.Perimetro();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OpCION INGRESADA NO VALIDA", "ERROR", 0);
                        break;
                }
                break;
            case 3:
                double radio = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL RADIO"));
                Circulo circunferencia = new Circulo(radio);
                circunferencia.Circunferencia();
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPCION INGRESADA NO VALIDA", "ERROR", 0);
                break;
        }
    }
}

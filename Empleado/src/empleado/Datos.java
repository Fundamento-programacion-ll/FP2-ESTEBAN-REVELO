package empleado;

import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Datos {

    private int in[][];
    private int nac[][];
    int guia;
    int guias;
    private String vector[][];

    public String[][] getVector() {
        return vector;
    }

    public void setVector() {
        String datosVector;
        for (int p = 0; p < 5; p++) {
            datosVector = JOptionPane.showInputDialog(null, "PORFAVOR INGRESE LOS DATOS SEPARADOS POR ESPACIO(NOMBRE APELLIDO SALARIO)");
            StringTokenizer tokkens = new StringTokenizer(datosVector, " ");
            for (int i = 0; i < 3 && tokkens.hasMoreTokens(); i++) {
                this.vector[p][i] = tokkens.nextToken();
            }
        }
    }

    public Datos(String[][] vector) {
        super();
        this.vector = vector;
    }

    public Datos() {
    }

    @Override
    public String toString() {
        return "vector: " + Arrays.toString(vector);
    }

    public void fecha() {
        int mayor = 0;
        int mayors = 0;
        if (in[0][2] > mayor) {
            mayor = in[0][2];
            guia = 0;
        }
        if (in[1][2] > mayor) {
            mayor = in[1][2];
            guia = 1;
        }
        if (in[2][2] > mayor) {
            mayor = in[2][2];
            guia = 2;
        }
        if (in[3][2] > mayor) {
            mayor = in[3][2];
            guia = 3;
        }
        if (in[4][2] > mayor) {
            mayor = in[4][2];
            guia = 4;
        }
        if (Integer.parseInt(vector[0][3]) > mayors) {
            mayors = Integer.parseInt(vector[0][3]);
            guias = 0;
        }
        if (Integer.parseInt(vector[1][3]) > mayors) {
            mayors = Integer.parseInt(vector[1][3]);
            guias = 1;
        }
        if (Integer.parseInt(vector[2][3]) > mayors) {
            mayors = Integer.parseInt(vector[2][3]);
            guias = 2;
        }
        if (Integer.parseInt(vector[3][3]) > mayors) {
            mayors = Integer.parseInt(vector[3][3]);
            guias = 3;
        }
        if (Integer.parseInt(vector[4][3]) > mayors) {
            mayors = Integer.parseInt(vector[4][3]);
            guias = 4;
        }
    }

    public String listarEmpleados() {
        for (int i = 0; i < 5; i++) {
            System.out.println("EMPLEADO " + (i + 1) + ": " + vector[i][0] + " " + vector[i][1] + " FECHA DE INGRESO: " + in[i][0] + "/" + in[i][1] + "/" + in[i][2] + " FECHA DE NACIMIENTO: " + nac[i][0] + "/" + nac[i][1] + "/" + nac[i][2] + " SALARIO: " + vector[i][2]);
        }
        System.out.println("MAS ANTIGUO: " + vector[guia][0] + " " + vector[guia][1] + " FECHA DE INGRESO: " + in[guia][0] + "/" + in[guia][1] + "/" + in[guia][2] + " FECHA DE NACIMIENTO: " + nac[guia][0] + "/" + nac[guia][1] + "/" + nac[guia][2] + " SALARIO: " + vector[guia][2]);
        System.out.println("MAS PAGADO: " + vector[guias][0] + " " + vector[guias][1] + " FECHA DE INGRESO: " + in[guias][0] + "/" + in[guias][1] + "/" + in[guias][2] + " FECHA DE NACIMIENTO: " + nac[guias][0] + "/" + nac[guias][1] + "/" + nac[guias][2] + " SALARIO: " + vector[guias][2]);
        return "";
    }

    public int[][] getNac() {
        return nac;
    }

    public int[][] getIn() {
        return in;
    }

    public void setIn() {
        String datosIngreso;
        for (int p = 0; p < 5; p++) {
            datosIngreso = JOptionPane.showInputDialog(null, "INGRESE LOS DATOS SEPARADOS POR / (DIA/MES/AñO)");
            StringTokenizer tokken = new StringTokenizer(datosIngreso, "/");
            for (int i = 0; i < 3 && tokken.hasMoreTokens(); i++) {
                this.in[p][i] = Integer.parseInt(tokken.nextToken());
            }
        }
    }

    public void setNac() {
        String datosNacimiento;
        for (int p = 0; p < 5; p++) {
            datosNacimiento = JOptionPane.showInputDialog(null, "INGRESE LOS DATOS SEPARADOS POR / (DIA/MES/AñO)");
            StringTokenizer tok = new StringTokenizer(datosNacimiento, "/");
            for (int i = 0; i < 3 && tok.hasMoreTokens(); i++) {
                this.nac[p][i] = Integer.parseInt(tok.nextToken());
            }
        }
    }
}

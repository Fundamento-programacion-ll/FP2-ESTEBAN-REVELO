package dimensiones;

public class Dimensiones {

    private double altura;
    private double base;
    private double lados;

    public Dimensiones(double altura, double base, double lados) {
        this.altura = altura;
        this.base = base;
        this.lados = lados;
    }

    public Dimensiones() {
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getLados() {
        return lados;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }
}

package polimorfismo_amt;

public class Retiros extends Transaccion {

    double retiro;

    public Retiros(int cuenta) {
        super(cuenta);
    }

    public Retiros(double retiro, int cuenta) {
        super(cuenta);
        this.retiro = retiro;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    @Override
    public String ejecutar() {
        return "RETIRO: " + retiro;
    }
}

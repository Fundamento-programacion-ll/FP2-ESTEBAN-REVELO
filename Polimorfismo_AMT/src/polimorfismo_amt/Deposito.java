package polimorfismo_amt;

public class Deposito extends Transaccion {

    double Deposito;

    public Deposito(int cuenta) {
        super(cuenta);
    }

    public Deposito(double Deposito, int cuenta) {
        super(cuenta);
        this.Deposito = Deposito;
    }

    public double getDeposito() {
        return Deposito;
    }

    public void setDeposito(double Deposito) {
        this.Deposito = Deposito;
    }

    @Override
    public String ejecutar() {
        return "DEPOSITO: " + Deposito;
    }
}

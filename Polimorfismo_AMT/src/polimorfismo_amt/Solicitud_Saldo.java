package polimorfismo_amt;

public class Solicitud_Saldo extends Transaccion {

    double saldo;

    public Solicitud_Saldo(int cuenta) {
        super(cuenta);
    }

    public Solicitud_Saldo(double saldo, int cuenta) {
        super(cuenta);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String ejecutar() {
        return "SALDO: " + saldo;
    }
}

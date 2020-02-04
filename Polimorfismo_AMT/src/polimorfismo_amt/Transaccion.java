package polimorfismo_amt;

public abstract class Transaccion {

    private int cuenta;

    public Transaccion(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int ObtenCuenta() {
        return cuenta;
    }

    public abstract String ejecutar();
}

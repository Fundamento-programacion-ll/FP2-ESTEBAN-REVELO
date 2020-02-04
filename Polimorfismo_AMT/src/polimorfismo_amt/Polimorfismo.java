package polimorfismo_amt;

public class Polimorfismo {

    public static void main(String[] args) {
        Retiros r = new Retiros(10, 100000);
        System.out.println("CUENTA N " + r.ObtenCuenta());
        System.out.println(r.ejecutar());
        Deposito d = new Deposito(15, r.ObtenCuenta());
        System.out.println(d.ejecutar());
        Solicitud_Saldo ss = new Solicitud_Saldo(100, r.ObtenCuenta());
        System.out.println(ss.ejecutar());
    }
}

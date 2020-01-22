
package serie;


public class Series {  
    int numero;
    public Series(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Series{" + "numero=" + numero + '}';
    }   
}

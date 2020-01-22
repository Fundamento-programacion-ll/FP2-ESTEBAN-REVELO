
package serie;


public class Calcular_Serie {
    public int Calculo(int numero){
        Series series=new Series(numero);
        int total=1; 
    for(int i=0; i<series.getNumero(); i++){
    total=total*2;
    }
    return total;
    } 
}

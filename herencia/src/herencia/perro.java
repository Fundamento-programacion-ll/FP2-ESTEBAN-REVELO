package herencia;

public class perro extends animal {

    protected float estatura;

    public perro(float estatura) {
        this.estatura = estatura;
    }

    public perro(float estatura, String especie, String genero, String nombre) {
        super(especie, genero, nombre);
        this.estatura = estatura;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public int sumaPerro(int n1, int n2) {
        return suma(n1, n2);
    }

    public void datosPerro() {
        System.out.println("nombre: " + getNombre() + " edad: " + getEdad() + " estatura: " + getEstatura());
    }
}

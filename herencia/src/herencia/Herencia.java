package herencia;

public class Herencia {

    public static void main(String[] args) {
        perro perrito = new perro(10, "perro", "masculino", "simurdiera");
        perrito.datosPerro();
        perrito.sumaPerro(1, 2);
        // ---------------------------------
        gato gatito = new gato("verdes", "gatos", "m", "chuky");
        gatito.info();
    }
}

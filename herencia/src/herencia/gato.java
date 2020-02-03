package herencia;

public class gato extends animal {

    private String colorOjos;

    public gato(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public gato(String colorOjos, String especie, String genero, String nombre) {
        super(especie, genero, nombre);
        this.colorOjos = colorOjos;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public void info() {
        System.out.println(getNombre() + " " + getColorOjos() + " " + getGenero() + " " + getEdad());
    }
}

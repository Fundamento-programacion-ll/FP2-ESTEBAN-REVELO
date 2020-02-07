package comparadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class pais {

    private ArrayList<provincias> listaProvincias;

    public pais() {
        this.listaProvincias = new ArrayList<>();
    }

    public pais(ArrayList<provincias> listaProvincias) {
        this.listaProvincias = listaProvincias;
    }

    public ArrayList<provincias> getListaProvincias() {
        return listaProvincias;
    }

    public void setListaProvincias() {
        int opcion;
        provincias provincia;
        do {
            provincia = new provincias();
            agregarProvincia(provincia);
            opcion = JOptionPane.showConfirmDialog(null, "Mas Provincias", "Continuar", JOptionPane.YES_NO_CANCEL_OPTION);
        } while (opcion == JOptionPane.YES_NO_CANCEL_OPTION);
    }

    public void agregarProvincia(provincias provincia) {
        this.listaProvincias.add(provincia);
    }

    public void ordenarPorNombreProvincia() {
        Collections.sort(listaProvincias, new comparador());
    }

    @Override
    public String toString() {
        return "Lista provincias \n" + listaProvincias;
    }
}

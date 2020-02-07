package comparadores;

public class Comparadores {

    public static void main(String[] args) {
        String salida = "";
        pais p = new pais();
        p.setListaProvincias();
        salida += "Lista Provincias: \n" + p.toString();
        System.out.println(salida);
        p.ordenarPorNombreProvincia();
        salida += "Lista Provincias: \n" + p.toString();
        System.out.println(salida);
    }
}

package Controlador;

import java.util.ArrayList;

public class User {

    ArrayList listaPersonas = new ArrayList<String>();

    public String agregarPersona(String nombre) {
        listaPersonas.add(nombre);
        System.out.println(nombre);
        return "Persona Agregada Correctamente, " + nombre;
    }

    public String listarPersonas() {
        String lista = "";
        for (int i = 0; i < listaPersonas.size(); i++) {

            System.out.println(listaPersonas.get(i));

            lista += listaPersonas.get(i).toString() + "\n";
        }
        return "";
    }
}

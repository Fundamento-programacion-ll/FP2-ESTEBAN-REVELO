package General;

import Modelo.Persona;
import Vista.Usuario;

public class MVC {

    public static void main(String[] args) {
        Usuario inicio = new Usuario();
        Persona Bryan = new Persona("Esteban", "Revelo", "1003982269", 20, "2444444", "Llano Grande", 'M', false);
        System.out.println(Bryan);
        inicio.menu();
    }
}

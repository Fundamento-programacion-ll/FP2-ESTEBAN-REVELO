package Vista;

import Controlador.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario {

    public void menu() {
        User metodo = new User();
        int opcion = 0;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU \n" + "1. Agregar Persona \n" + "2. Listar Personas \n" + "3. SALIR \n", this));
        switch (opcion) {
            case 1:
                String nombre = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE", this);
                metodo.agregarPersona(nombre);
                break;
            case 2:
                System.out.println(metodo.listarPersonas());
                break;
            case 3:
                System.out.println("EJECUCION FINALIZADA");
                break;
            default:
                System.out.println("EJECUCION FINALIZADA");
                break;
        }
    }
}

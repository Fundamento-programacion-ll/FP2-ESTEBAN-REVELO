package deber.cedula;

import java.util.Scanner;

public class ValidarCedula {

    public static void main(String[] args) {
        int suma = 0;
        int resta = 0;
        int acum;
        int ced;
        Scanner scan = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE CEDULA DE IDENTIDAD");
        String cedula = scan.next();
        for (int i = 0; i < cedula.length() - 1; i++) {
            ced = Integer.parseInt(cedula.charAt(i) + "");
            if (i % 2 == 0) {
                ced = ced * 2;
                if (ced > 9) {
                    ced = ced - 9;
                }
            }
            suma = suma + ced;
        }
        if (suma % 10 != 0) {
            acum = ((suma / 10) + 1) * 10;
            resta = acum - suma;
        }
        int ultimo = Integer.parseInt(cedula.charAt(9) + "");
        if (ultimo == resta) {
            System.out.println("EL NUMERO DE CEDULA INGRESADA ES CORRECTA");
        } else {
            System.out.println("EL NUMERO DE CEDULA INGRESADA ES INCORRECTA");
        }
    }
}

package serie;

import java.util.Scanner;

public class Serie {

    public static void main(String[] args) {
        int num;
        Calcular_Serie total = new Calcular_Serie();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese número");
        num = scan.nextInt();
        Series s = new Series(num);
        System.out.println("2^" + num + " = " + total.Calculo(num));
    }
}

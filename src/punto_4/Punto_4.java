package punto_4;

import java.util.Scanner;

/**
 *
 * @author Kmylho https://linktr.ee/Kmylho
 */
public class Punto_4 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        double iva = 21;
        System.out.println("Ingrese el valor del precio");
        double preciosiniva = reader.nextInt();

        System.out.println(((iva*preciosiniva)/100)+preciosiniva);
    }
}

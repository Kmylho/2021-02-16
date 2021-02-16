package punto_3;

import java.util.Scanner;

/**
 *
 * @author Kmylho https://linktr.ee/Kmylho
 */
public class Punto3 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        try{
            System.out.println("Ingrese el valor del radio");
            String radiotext = reader.nextLine();
            double radio = Double.parseDouble(radiotext);
            double resultado = (Math.pow(radio,2)*Math.PI);
            System.out.println("El area del circulo es: "+resultado);

        }catch (NumberFormatException e){
            System.out.println("Caracter mal incresado");
        }


    }
}

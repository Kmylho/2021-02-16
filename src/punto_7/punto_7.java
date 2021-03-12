package punto_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class punto_7 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = numero.nextInt();
        try{
            boolean comprobar = true;
            do {
                if (number == 0 ){
                    System.out.println("El numero que ingreso fue: "+number);
                } else if (number < 0){
                    System.out.println("El numero: "+number+", es menor a 0");
                }else {
                    System.out.println("El numero: "+number+", es mayor a 0");
                }
                comprobar = true;
            }while (comprobar = false);
        }catch (InputMismatchException e){
            System.out.println("Caracter mal ingresado");
        }

    }
}

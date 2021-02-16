package punto_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        try{
            System.out.println("Ingrese el primer numero entero");
            int numero1 = reader.nextInt();
            System.out.println("Ingrese el segundo numero entero");
            int numero2 = reader.nextInt();
            if (numero1>numero2){
                System.out.println("El primer numero : "+numero1+" es mayor al segundo numero :"+numero2);
            }else if(numero1<numero2){
                System.out.println("El segundo numero : "+numero2+" es mayor al primer numero  :"+numero1);
            }else if(numero1 == numero2){
                System.out.println("Son iguales los numeros : "+numero1);
            }else{
                System.out.println("Error");
            }
        }catch (InputMismatchException e){
            System.out.println("Caracter mal ingresado");
        }

    }
}

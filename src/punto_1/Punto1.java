package punto_1;

import java.util.InputMismatchException;
/**
 *
 * @author Kmylho https://linktr.ee/Kmylho
 */
public class Punto1 {

    public static void main(String[] args) {
        try{
            int numero1 = 2;
            int numero2 = 2;
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


package punto_14;

import javax.swing.*;

public class punto_14 {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero entero"));
            while (x <= 1000) {
                System.out.println(x);
                x = x + 2;
            }
        }catch (Exception e){
            System.out.println(e.getMessage()+"El número ingresado no es un entero");
        }

    }
}

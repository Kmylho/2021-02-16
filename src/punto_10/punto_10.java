package punto_10;

import javax.swing.*;

public class punto_10 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Ingrese una frase");
        frase = frase.replace(" ", "");
        System.out.println(frase);
    }
}

package punto_9;

import javax.swing.*;

public class punto_9 {

    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza ";
        frase = frase.replace("a", "e");
        System.out.println(frase);
        String frase2 = JOptionPane.showInputDialog(null, "Ingresa un frase");
        System.out.println(frase.concat(frase2));
    }
}

package punto_17;

import punto_17.modelo.Electrodomestico;
import punto_17.modelo.Nevera;
import punto_17.modelo.Televisor;

import java.util.ArrayList;

public class punto_17 {
    public static void main(String[] args) {
        ArrayList <Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
        Electrodomestico licuadora = new Electrodomestico(1,"A","Nacional");
        Electrodomestico batidora = new Electrodomestico(2, "C","Importado");
        electrodomesticos.add(licuadora);
        electrodomesticos.add(batidora);
        System.out.println("Los electrodomesticos vendidos tienen las siguientes características: " + electrodomesticos);

        Electrodomestico nev1 = new Nevera(3,"C","Importado", 150);
        Electrodomestico nev2 = new Nevera(4,"B","Nacional", 120);
        electrodomesticos.add(nev1);
        electrodomesticos.add(nev2);

        Electrodomestico tv1 = new Televisor(5,"C","Importado", 45, true);
        Electrodomestico tv2 = new Televisor(6,"B","Nacional", 55, false);
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);

        double totalTelevisor=0;
        double totalNevera=0;
        double totalElectrodomesticos=0;
        int cantidad = 0;
        for (Electrodomestico electrodomestico : electrodomesticos){
            if (electrodomestico instanceof Televisor){
                totalTelevisor+=electrodomestico.getPrecio();
                cantidad++;
            }else if (electrodomestico instanceof Nevera){
                totalNevera+=electrodomestico.getPrecio();
                cantidad++;
            }else{
                totalElectrodomesticos+=electrodomestico.getPrecio();
                cantidad++;
            }
        }
        System.out.println("El valor total de los televisores vendidos es: " + totalTelevisor);
        System.out.println("El valor total de los neveras vendidos es: " + totalNevera);
        System.out.println("El valor total de los otros electrodomesticos vendidos es: " + totalElectrodomesticos);
        System.out.println("La cantidad total de electrodomesticos vendidos es: " + cantidad);

    }
}

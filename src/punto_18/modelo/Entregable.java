package punto_18.modelo;

public interface Entregable {

    void entregar();
    void devolver();
    boolean isEntregado();
    int compareTo(Object a);
}
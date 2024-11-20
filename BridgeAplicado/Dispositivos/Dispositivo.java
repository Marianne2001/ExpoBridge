package Dispositivos;

public interface Dispositivo {
    boolean estaEncendido();

    void encender();
    void apagar();

    int obtenerVolumen();
    void establecerVolumen(int porcentaje);

    int obtenerCanal();
    void establecerCanal(int canal);

    void imprimirEstado();
}

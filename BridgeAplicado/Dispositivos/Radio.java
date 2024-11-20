package Dispositivos;

public class Radio implements Dispositivo {
    private boolean encendido = false;
    private int volumen = 30;
    private int canal = 1;

    @Override
    public boolean estaEncendido() {
        return encendido;
    }

    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    @Override
    public int obtenerVolumen() {
        return volumen;
    }

    @Override
    public void establecerVolumen(int volumen) {
        if (volumen > 100) {
            this.volumen = 100;
        } else if (volumen < 0) {
            this.volumen = 0;
        } else {
            this.volumen = volumen;
        }
    }

    @Override
    public int obtenerCanal() {
        return canal;
    }

    @Override
    public void establecerCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public void imprimirEstado() {
        System.out.println("------------------------------------");
        System.out.println("| Soy una radio.");
        System.out.println("| Estoy " + (encendido ? "encendida" : "apagada"));
        System.out.println("| El volumen actual es " + volumen + "%");
        System.out.println("| El canal actual es " + canal);
        System.out.println("------------------------------------\n");
    }
}

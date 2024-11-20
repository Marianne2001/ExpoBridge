package Controles;

import Dispositivos.Dispositivo;

public class ControlRemotoBasico implements ControlRemoto {
    protected Dispositivo dispositivo;

    public ControlRemotoBasico() {}

    public ControlRemotoBasico(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void encenderApagar() {
        System.out.println("Control Remoto: alternar encendido/apagado");
        if (dispositivo.estaEncendido()) {
            dispositivo.apagar();
        } else {
            dispositivo.encender();
        }
    }

    @Override
    public void bajarVolumen() {
        System.out.println("Control Remoto: bajar volumen");
        dispositivo.establecerVolumen(dispositivo.obtenerVolumen() - 10);
    }

    @Override
    public void subirVolumen() {
        System.out.println("Control Remoto: subir volumen");
        dispositivo.establecerVolumen(dispositivo.obtenerVolumen() + 10);
    }

    @Override
    public void bajarCanal() {
        System.out.println("Control Remoto: bajar canal");
        dispositivo.establecerCanal(dispositivo.obtenerCanal() - 1);
    }

    @Override
    public void subirCanal() {
        System.out.println("Control Remoto: subir canal");
        dispositivo.establecerCanal(dispositivo.obtenerCanal() + 1);
    }
}

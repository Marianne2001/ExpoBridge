package Controles;

import Dispositivos.Dispositivo;

public class ControlRemotoAvanzado extends ControlRemotoBasico {

    public ControlRemotoAvanzado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void silenciar() {
    if (dispositivo.estaEncendido()) {  // Verificamos si el dispositivo está encendido
        dispositivo.establecerVolumen(0);  // O cualquier otra lógica para silenciar
        System.out.println("El dispositivo ha sido silenciado.");
    } else {
        System.out.println("El dispositivo debe estar encendido para poder silenciarlo.");
    }
}

}

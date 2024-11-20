import Dispositivos.Dispositivo;
import Dispositivos.Radio;
import Dispositivos.Television;
import Controles.ControlRemotoBasico;
import Controles.ControlRemotoAvanzado;

import java.util.Scanner;

public class EjemploBridgeInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Selección de dispositivo
        System.out.println("Seleccione el dispositivo: ");
        System.out.println("1 - Televisión");
        System.out.println("2 - Radio");
        int dispositivoSeleccionado = scanner.nextInt();
        
        while (dispositivoSeleccionado != 1 && dispositivoSeleccionado != 2) {
        System.out.println("Opción no válida. Por favor ingrese 1 para Televisión o 2 para Radio.");
        dispositivoSeleccionado = scanner.nextInt();
        }

        Dispositivo dispositivo;
        if (dispositivoSeleccionado == 1) {
            dispositivo = new Television();
        } else {
            dispositivo = new Radio();
        }

        // Selección de tipo de control remoto
        System.out.println("Seleccione el tipo de control remoto:");
        System.out.println("1 - Básico");
        System.out.println("2 - Avanzado");
        int tipoControl = scanner.nextInt();
        
        while (tipoControl != 1 && tipoControl != 2) {
        System.out.println("Opción no válida. Por favor ingrese 1 para Básico o 2 para Avanzado.");
        tipoControl = scanner.nextInt();
        }

        if (tipoControl == 1) {
            ControlRemotoBasico control = new ControlRemotoBasico(dispositivo);
            ejecutarControl(control, dispositivo);
        } else {
            ControlRemotoAvanzado control = new ControlRemotoAvanzado(dispositivo);
            ejecutarControl(control, dispositivo);
        }

        scanner.close();
    }

    public static void ejecutarControl(ControlRemotoBasico control, Dispositivo dispositivo) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú de opciones
            System.out.println("\nElija una opción:");
            System.out.println("1 - Encender/Apagar");
            System.out.println("2 - Subir Volumen (sube en decenas)");
            System.out.println("3 - Bajar Volumen (baja en decenas)");
            System.out.println("4 - Subir Canal");
            System.out.println("5 - Bajar Canal");
            if (control instanceof ControlRemotoAvanzado) {
                System.out.println("6 - Silenciar");
            }
            System.out.println("0 - Salir");

            opcion = scanner.nextInt();

            // Ejecución de las opciones seleccionadas
            switch (opcion) {
                case 1:
                    control.encenderApagar();
                    break;
                case 2:
                    control.subirVolumen();
                    break;
                case 3:
                    control.bajarVolumen();
                    break;
                case 4:
                    control.subirCanal();
                    break;
                case 5:
                    control.bajarCanal();
                    break;
                case 6:
                    if (control instanceof ControlRemotoAvanzado) {
                        ((ControlRemotoAvanzado) control).silenciar();
                    } else {
                        System.out.println("Opción no disponible en el control básico.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

            // Imprimir el estado del dispositivo después de cada acción
            dispositivo.imprimirEstado();

        } while (opcion != 0);

        scanner.close();
    }
}

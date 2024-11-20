// Interfaz de Implementación
interface Implementacion {
    void operacionImplementacion();
}

// Clase de Implementación Concreta 1
class ImplementacionConcretaA implements Implementacion {
    @Override
    public void operacionImplementacion() {
        //"Operación implementada en ImplementacionConcretaA."
    }
}

// Clase de Implementación Concreta 2
class ImplementacionConcretaB implements Implementacion {
    @Override
    public void operacionImplementacion() {
        //"Operación implementada en ImplementacionConcretaB."
    }
}

// Clase de Abstracción
abstract class Abstraccion {
    protected Implementacion implementacion;

    // Constructor que recibe una implementación
    public Abstraccion(Implementacion implementacion) {
        this.implementacion = implementacion;
    }

    // Método abstracto que las subclases deben implementar
    public abstract void operacion();
}

// Clase concreta que extiende la Abstracción
class AbstraccionExtendida extends Abstraccion {

    public AbstraccionExtendida(Implementacion implementacion) {
        super(implementacion);
    }

    @Override
    public void operacion() {
        //"Operación en AbstraccionExtendida:"
        implementacion.operacionImplementacion();
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Crear Implementación Concreta A
        Implementacion implementacionA = new ImplementacionConcretaA();
        Abstraccion abstraccionA = new AbstraccionExtendida(implementacionA);
        abstraccionA.operacion();

        // Crear Implementación Concreta B
        Implementacion implementacionB = new ImplementacionConcretaB();
        Abstraccion abstraccionB = new AbstraccionExtendida(implementacionB);
        abstraccionB.operacion();
    }
}

package tarea;

/**
 *
 * @author adriel
 */
public class Nodo {

    int valor;
    Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object obtenerValor() {
        return valor;
    }

    public void enlazarSiguiente(Nodo n) {
        siguiente = n;
    }

    public Nodo obtenerSiguiente() {
        return siguiente;
    }
}

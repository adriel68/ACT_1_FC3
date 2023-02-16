
package tarea;

/**
 *
 * @author adriel
 */
public class Lista {
    
    Nodo cabeza;
    int size;
    
    public Lista(){
        cabeza = null;
        size = 0;
    }
    
    public Object obtener(int index){
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < index){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }
    
    public void addPrimero(int obj){
        if (cabeza == null) {
            cabeza = new Nodo(obj);
        }else{
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;
        }
        size++;
    }
    
    public void eliminar(int index){
        if (index == 0) {
            cabeza = cabeza.obtenerSiguiente();
        }else{
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < index - 1){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        temporal.enlazarSiguiente(
                temporal
                .obtenerSiguiente()
                .obtenerSiguiente()
                );
        }
        size--;
    }
    
    public void eliminarPrimero(){
        cabeza = cabeza.obtenerSiguiente();
        size--;
    }
    
    public int size(){
        return size;
    }
    
    public boolean estaVacia(){
        return(cabeza == null)?true:false;
    }
}

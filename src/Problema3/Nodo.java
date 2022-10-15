
package Problema3;

class Nodo{
    private Dispositivo dispositivo;
    private Nodo siguiente;
    public Nodo(Dispositivo dispositivo){
        this.dispositivo=dispositivo;
        siguiente=null;
    }
    public Dispositivo getDispositivo() {
        return dispositivo;
    }
    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}  

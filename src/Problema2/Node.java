/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;

/**
 *
 * @author Jose Siles
 */
public class Node {
    private int valor;
    private Node siguiente;
    private int[] array;
    private int paginas;

    public Node(int valor, Node siguiente, int[] array, int paginas) {
        this.valor = valor;
        this.siguiente = siguiente;
        this.array = array;
        this.paginas = paginas;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
  

    

}

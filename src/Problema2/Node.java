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
    private double idDocumento;
    private int paginas;
  

    public Node() {
        this.valor = 0;
        this.siguiente = null;
        this.idDocumento =0;
        this.paginas =0;
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

    public double getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(double idDocumento) {
        this.idDocumento = idDocumento;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

}

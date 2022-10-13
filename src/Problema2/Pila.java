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
public class Pila {
     private Node cima;
    private int largo;

    public Pila() {
        this.cima = null;
        this.largo = 0;
    }
    
    public boolean Vacia(){ return cima == null;}
    
    public int tamanio(){ return this.largo;}
    
    public void push(int valor){
        Node newNode = new Node();
        newNode.setValor(valor);
        
        if (this.Vacia()){
            this.cima = newNode;
        }
        else{
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
        }
        this.largo++;
    }
    
    public void pop(){
        if (!Vacia()) {
           
            this.cima = this.cima.getSiguiente();
       
            this.largo--;
        }
    }
    
    public boolean search(int reference) {
       
        Node aux = cima;
       
        boolean exist = false;
        
        while (exist != true && aux != null) {
          
            if (reference == aux.getValor()) {
               
                exist = true;
            } else {
               
                aux = aux.getSiguiente();
            }
        }
       
        return exist;
    }
    
        public void popModificado(int reference){
       
        if (search(reference)) {
          
            Node cimapPilaAux = null;
           
            while(reference != cima.getValor()){
                Node temp = new Node();
               
                temp.setValor(cima.getValor());
               
                if(cimapPilaAux == null){
                   
                    cimapPilaAux = temp;
                }
                
                else{
                    temp.setSiguiente(cimapPilaAux);
                    cimapPilaAux = temp;
                }
              
                pop();
            }
           
            pop();
           
            while(cimapPilaAux != null){
               
                push(cimapPilaAux.getValor());
               
                cimapPilaAux = cimapPilaAux.getSiguiente();
            }
          
            cimapPilaAux = null;
        }
        else{
            System.out.println("El nodo indicado no existe");
        }
    } 
        public void listar(){
        
        Node aux = cima;
       
        while(aux != null){
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;

/**
 *
 * @author jarma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila miPila = new Pila();
        
        miPila.push(5);
        miPila.push(89);  
        miPila.push(100);
        miPila.push(677);
        miPila.push(980);
        
      
        
        System.out.println("PILA ANTES DEL POP");
        miPila.listar();
        
        miPila.pop();
        
        System.out.println("PILA DESPUES DE UN POP");
        miPila.listar();
        
        
        miPila.popModificado(89);
        System.out.println("PILA DESPUES DE UN DELETE A LA REFERENCIA 89");
        miPila.listar();
        
        miPila.asignardidDoc();
        
       
    }
    
}

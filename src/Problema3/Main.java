
// Autor Carlos Esteban Bello Salinas

package Problema3;

import java.util.Scanner;


public class Main {
    public static void main(String [] args){
        
        //Se utiliza el metodo Scanner para el menú
        
        Scanner sc=new Scanner(System.in);
        Cola cola=new Cola();
        
        //Se crean las variables
        
        int opcion=0;
        int numero=0;
        int puntuacion=0;
        while(opcion!=3){
            System.out.println("Bienvenido al programa");
            System.out.println("1.Agregar dispositivo");
            System.out.println("2.Revisar dispositivo");
            System.out.println("3.Salir");
            opcion=sc.nextInt();
            switch(opcion){
                
                // En el caso 1 se pregunta el número de serie 
                // y se hace un nextInt de la variable numero
                
                case 1:
                    System.out.println("Ingrese el número de serie");
                    numero=sc.nextInt();
                    
                // Se ingresa la puntuación del dispositivo
                // Y se hace un nextInt de la variable puntuacion  
                    
                    System.out.println("Ingrese la puntuación del dispositivo");
                    puntuacion=sc.nextInt();
                    
                // Se instancia la clase dispositivo con el numero y puntuacion
                // y se agrega el dispositivo a la cola
                    
                    Dispositivo dispositivo=new Dispositivo(numero,puntuacion);
                    cola.agregarDispositivo(dispositivo);
                    break;
                case 2:
                    cola.revisarDispositivo();
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el programa");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}

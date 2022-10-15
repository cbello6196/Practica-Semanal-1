
package Problema3;


//Se crea la clase cola con sus atributos primero y ultimo

class Cola{
    Nodo primero;
    Nodo ultimo;
    public Cola(){
        primero=null;
        ultimo=null;
    }
// Se hacen los metodos agregarDispositivos y revisar dispositivos
// El metodo agregarDispositivo agrega un dispositivo ya sea al inicio o final     
    public void agregarDispositivo(Dispositivo dispositivo){
        Nodo nuevo=new Nodo(dispositivo);
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.setSiguiente(nuevo);
            ultimo=nuevo;
        }
        System.out.println("Dispositivo agregado");
    }
    
    //El metodo revisarDispositivo primero verifica que haya un dispositivo
    
    public void revisarDispositivo(){
        if(primero==null){
            System.out.println("No hay dispositivos para revisar");
            
    // se crea un else para crear los if con las puntuaciones        
        }else{
            if(primero.getDispositivo().getPuntuacion()<250){
                primero=primero.getSiguiente();
                System.out.println("El dispositivo fue descartado");
            }else if(primero.getDispositivo().getPuntuacion()<500){
                System.out.println("El dispositivo "
                        + "fue devuelto al final de la cola");
                
    // Se devuelve el dispositivo a la cola 
                ultimo.setSiguiente(primero);
                ultimo=primero;
                primero=primero.getSiguiente();
                ultimo.setSiguiente(null);
    //Se envia el Dispositivo al cliente "atendiendo" el dispositivo             
            }else{
                primero=primero.getSiguiente();
                System.out.println("Dispositivo enviado al cliente");
            }
        }
    }
}

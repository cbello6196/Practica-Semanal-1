
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        Problemas B = new Problemas();
        Problemas A = new Problemas();
        int op = 0;
        while(op != 6){
            op = Integer.parseInt(JOptionPane.showInputDialog(
                "Escoga el problema:\n"
                + "1. vocales\n"
                + "2. números\n"
                + "3. binario\n"
                + "4. código\n"
                + "5. Convertidor binario (EXTRA)\n"
                + "6. Salir"));  
            switch(op){
            
                case 1:
                    String str = "Estructura de Datos - Universidad Fidelitas Costa Rica";    
                    System.out.println(A.Quitarvocal(str));
                    break;
                case 2:
                    B.ProblemaB(20);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    break;              
            }
        }
    }
} 

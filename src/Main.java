
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        //Se instancian los problemas
        
        Problemas p = new Problemas();
        
        // Se crea el menú para llamar los diferentes problemas
        
        int op = 0;
        while (op != 6) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escoga el problema:\n"
                    + "1. vocales\n"
                    + "2. números\n"
                    + "3. binario\n"
                    + "4. código\n"
                    + "5. Convertidor binario (EXTRA)\n"
                    + "6. Salir"));
            switch (op) {

                case 1:
                    String str = "Estructura de Datos - Universidad Fidelitas Costa Rica";
                    System.out.println(p.Quitarvocal(str));
                    break;
                case 2:
                    p.ProblemaB(20);
                    break;
                case 3:
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a verificar"));
                    if (p.ProblemaC(numero))
                            System.out.println("El numero es binario");
                    else System.out.println("El numero no es binario");
                    break;
                case 4:
                    p.calcExponencial(20, 10);
                    p.factorial(50);
                    break;
                case 5:
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a convertir "));

                    int numeros = p.ProblemaE(num);
                    JOptionPane.showMessageDialog(null, "El resultado es:\n "
                            + numeros);
                    break;
                case 6:
                    break;
            }
        }
    }
}

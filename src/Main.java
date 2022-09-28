
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        Problemas A = new Problemas();
        Problemas B = new Problemas();
        
        Problemas D = new Problemas();
        Problemas E = new Problemas();
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
                    System.out.println(A.Quitarvocal(str));
                    break;
                case 2:
                    B.ProblemaB(20);
                    break;
                case 3:

                    break;
                case 4:
                    D.calcExponencial(1, 1);
                    D.factorial(1);
                    break;
                case 5:
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a convertir "));

                    int numeros = E.ProblemaE(num);
                    JOptionPane.showMessageDialog(null, "El resultado es:\n "
                            + numeros);
                    break;
                case 6:
                    break;
            }
        }
    }
}


public class Problemas {
   
    public int ProblemaB(int n) { 
        int suma = 0; 
        for (int i = 1; i <= n; i++) { 
        suma = suma + i;
        System.out.printf("total: %d\n",suma);    
        } 
        return suma; 
    }
}



import java.util.Arrays;
import java.util.List;


public class Problemas {
   public String Quitarvocal(String str)
    {
         Character vocales[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
          
         List<Character> al = Arrays.asList(vocales);
          
         StringBuffer sb = new StringBuffer(str);
          
         for (int i = 0; i < sb.length(); i++) {
             
             if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
             }
        }        
        return sb.toString();
    }
    public int ProblemaB(int n) { 
        int suma = 0; 
        for (int i = 1; i <= n; i++) { 
        suma = suma + i;
        System.out.printf("total: %d\n",suma);    
        } 
        return suma; 
    }
}


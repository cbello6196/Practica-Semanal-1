
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
    
         public double calcExponencial(int n, int x){
      double result1 =0;
      double result2=0;
      for (int i=0; i<n; i++){
          result1 = result1-(1) + (Math.pow(x,i) / factorial(i));
      }
     
      
       for (int i=0; i<n; i++){
          result2 = result2 + (Math.pow(x,i) / factorial(i));
      }
        System.out.printf("Resultado del calculo exponencial sin recursividad:" + result2+"\n"+"Resultado del calculo exponencial con recursivada:"+ result1);
        return result1;
    }
      public double factorial (int num){
           double result1 =0;
           double result2=0;
          for (int i=1; i<=num; i++){
              result1 = result1-(1) *i;
          }
           for (int i=1; i<=num; i++){
              result2 = result2 *i;
          }
           System.out.printf("Resultado del calculo factorial sin recursividad:" + result2+"\n"+"Resultado del calculo factorial con recursivada:"+ result1);
          return result1; 
      }
  
}


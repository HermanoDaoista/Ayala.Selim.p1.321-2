/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposexceptions321;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TiposExceptions321 {

    public static void main(String[] args) {
        
        long f;
        try {
            f = factorial(20);
        System.out.println("Factorial : " + f);
        } catch (IntegerOverflowException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        
        
        
        /*try {
        long f = factorial(-3);
        
        System.out.println("Factorial : " + f);
        }catch(IntegerOverflowException | ArithmeticException ex) {
                System.out.println(ex.getMessage());
                
        }*/
            
        }
        
    
    /**
     * 
     * @param n
     * @return 
     * @throws tiposexceptions321.IntegerOverflowException 
     */
        
    public static long factorial(int n) throws IntegerOverflowException {
       if(n < 0) {
           throw new ArithmeticException("no esta definido el factorial de un numero negativo");
       }
       if(n > 16) {
           throw new IntegerOverflowException();
       }
       int fact =1;
       for(int i =2; i <= n; i++) {
           fact*=i; 
       }
       return fact;
   }
    
    
}

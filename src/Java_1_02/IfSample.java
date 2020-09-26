/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_02;

/**
 *
 * @author Dmitry
 */
public class IfSample {
    
    public static void main(String[] args) {
    
        int x, y;    
    
        x = 10;
        y = 20;
        
        if(x<y) System.out.println("x меньше y");
        
        x=x*2;
        if(x==y) System.out.println("x равно y");
       
        x=x*2;
        if(x>y) System.out.println("x больше y");
        
        if(x==y) System.out.println("x равно y"); 
                else System.out.println("x не равно y");
       
    }
   
}

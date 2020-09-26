/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_10.MyTrowable;

import java.util.Random;

/**
 *
 * @author Dmitry
 */
public class HandleError 
{
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Random r = new Random();
        
        for(int i = 0; i<32000;i++){
            try 
            {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
                
            }catch (ArithmeticException e)
            {
                System.out.println("Деление на ноль.");
                a = 0;
//                System.out.println("a: " + a);
//                System.out.println("b: " + b);
//                System.out.println("c: " + c);
//                System.out.println("b/c: " + b/c);
            }
            System.out.println("a: " + a);
        }
    }
}

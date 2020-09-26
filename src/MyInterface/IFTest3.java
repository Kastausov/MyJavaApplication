/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInterface;

import MyInterface.FixedStack;
import MyInterface.IntStack;

/**
 *
 * @author Dmitry
 */
public class IFTest3 
{
    public static void main(String[] args) 
    {
        IntStack mystack;
        
        FixedStack fs = new FixedStack(8);
        DynStack ds = new DynStack(5);
        
        mystack = fs;
        for(int i = 0;i<8;i++) mystack.push(i);
        mystack = ds;
        for(int i = 0;i<12;i++) mystack.push(i);
        
        mystack = fs;
        System.out.println("Значения в FixedStack: ");
        for(int i = 0;i<8;i++) System.out.println(mystack.pop());
        
        mystack = ds;
        System.out.println("Значения в DynStack: ");
        for(int i = 0;i<12;i++) System.out.println(mystack.pop());
    }
}
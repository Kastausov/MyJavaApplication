/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInterface;

import MyInterface.FixedStack;

/**
 *
 * @author Dmitry
 */
public class IFTest {
    public static void main(String[] args) {
        
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);
        
        for(int i = 0;i<5;i++) mystack1.push(i);
        for(int i = 0;i<8;i++) mystack2.push(i);
        
        System.out.println("Стэк в mystack1:");
        for(int i = 0;i<5;i++) {
            System.out.println(mystack1.pop());
        }
        
        System.out.println("Стэк в mystack2:");
        for(int i = 0;i<8;i++){
            System.out.println(mystack2.pop());
        }
    }    
}

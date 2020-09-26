/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_06;

import Java_1_06.Stack;

/**
 *
 * @author Dmitry
 */
public class TestStack {
    public static void main(String[] args) {
        
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        
        for(int i = 0;i<10;i++) mystack1.push(i);
        for(int i = 10;i<20;i++) mystack2.push(i);
        
        for(int i = 0;i<10;i++) {
            System.out.println(mystack1.pop());
        }
        for(int i = 10;i<20;i++){
            System.out.println(mystack2.pop());
        }
    }
}

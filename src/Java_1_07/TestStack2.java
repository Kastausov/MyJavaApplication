/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_07;

import Java_1_06.Stack;

/**
 *
 * @author Dmitry
 */
public class TestStack2 {
    public static void main(String[] args) {
        
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);
        
        for(int i = 0;i<5;i++) mystack1.push(i);
        for(int i = 10;i<18;i++) mystack2.push(i);
        
        System.out.println("Стэк в mystack1:");
        for(int i = 0;i<5;i++) {
            System.out.println(mystack1.pop());
        }
        
        System.out.println("Стэк в mystack2:");
        for(int i = 10;i<18;i++){
            System.out.println(mystack2.pop());
        }
    }
}

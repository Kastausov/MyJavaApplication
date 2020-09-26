/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_03;

/**
 *
 * @author Dmitry
 */
public class Scope {
    public static void main(String[] args) {
        int x;
        
        x = 10;
        if(x==10){
            int y =20;
            System.out.println("x и y :" + x + " " + y);
            x = y*2;
        }
        //y = 100;
        System.out.println("x равна " + x);
        int count; count = 100;
       
    }
    
}

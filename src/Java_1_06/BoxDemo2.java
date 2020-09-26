/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_06;

import Java_1_06.Box;

/**
 *
 * @author Dmitry
 */
public class BoxDemo2 {
    public static void main(String[] args) {
        double vol;
        
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        mybox1.depth  = 15;
        mybox1.height = 20;
        mybox1.width  = 10;
        
        mybox2.depth  = 7;
        mybox2.height = 25;
        mybox2.width  = 17;
        
        vol = mybox1.depth * mybox1.height * mybox1.width;
        System.out.println("Объём коробки \"1\" равен " + vol);
    
        vol = mybox2.depth * mybox2.height * mybox2.width;
        System.out.println("Объём коробки \"2\" равен " + vol);
    }    
}

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
public class BoxDemo {
    public static void main(String[] args) {
        double vol;
        Box mybox = new Box();
        mybox.depth  = 15;
        mybox.height = 20;
        mybox.width  = 10;
        
        vol = mybox.depth * mybox.height * mybox.width;
        
        System.out.println("Объём коробки равен " + vol);
    }
}

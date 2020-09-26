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
public class BoxDemo3 {
    public static void main(String[] args) {
        
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        mybox1.depth    = 7;
        mybox1.height   = 7;
        mybox1.width    = 7;
        
        mybox2.depth    = 3;
        mybox2.height   = 3;
        mybox2.width    = 3;
        
        mybox1.printVolume();
        mybox2.printVolume();
        
    }
}

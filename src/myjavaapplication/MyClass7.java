/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavaapplication;

import Java_1_06.Box;

/**
 *
 * @author Dmitry
 */
public class MyClass7 {
    public static void main(String[] args) {
        
        Box mybox1 = new Box();
        Box mybox2 = mybox1;
        
        mybox1 = null;
        
        mybox2.depth = 3;
        mybox2.height = 3;
        mybox2.width = 3;
        
        //mybox1.printVolume();
        mybox2.printVolume();
    }
}

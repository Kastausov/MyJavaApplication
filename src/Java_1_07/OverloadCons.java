/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_07;

import Java_1_06.Box;

/**
 *
 * @author Dmitry
 */
public class OverloadCons {
    public static void main(String[] args) {
                double vol;
        
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        
        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен " + vol);
    }
}

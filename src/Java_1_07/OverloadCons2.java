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
public class OverloadCons2 {
    public static void main(String[] args) {
        
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(17);
        Box myclone = new Box(mybox1);
        
        double vol;
        
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
        
        vol = myclone.volume();
        System.out.println("Объем myclone равен " + vol);
        
    }
}

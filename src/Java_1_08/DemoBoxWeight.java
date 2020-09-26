/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_08;

import Java_1_08.BoxWeight;

/**
 *
 * @author Dmitry
 */
public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен: " + vol);
        System.out.println("Вес mybox1 равен: " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен: " + vol);
        System.out.println("Вес mybox2 равен: " + mybox2.weight);
    }
}

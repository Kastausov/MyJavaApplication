/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_08;

import Java_1_08.BoxWeight;
import Java_1_06.Box;

/**
 *
 * @author Dmitry
 */
public class RefDemo 
{
    public static void main(String[] args) 
    {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox;
        double vol;
        
        vol = weightbox.volume();
        System.out.println("Объем mybox1 равен: " + vol);
        System.out.println("Вес mybox1 равен: " + weightbox.weight);
        System.out.println();
        
        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("Объем mybox2 равен: " + vol);
        //System.out.println("Вес mybox2 равен: " + plainbox.weight);
    }    
}

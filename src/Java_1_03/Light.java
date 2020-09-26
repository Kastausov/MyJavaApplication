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
public class Light {
    
    public static void main(String[] args) {
        
    int linghtspeed;
        long days;
        long seconds;
        long distance;

        linghtspeed = 186000;
        days        = 1000;
        seconds     = days * 24 * 60 * 60;
        distance    = linghtspeed * seconds;

        System.out.print("За " + days);
        System.out.print(" свет пройдёт около ");
        System.out.println(distance + " миль.");
    
    }
    
}

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
public class LifeTime {
    public static void main(String[] args) {
        int x;
        
        for(x=0;x<3;x++){
            int y = -1;
            System.out.println("y равна:" + y);
            y = 100;
            System.out.println("y теперь равна: " + y);
        }
    }
    
}

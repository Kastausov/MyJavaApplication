/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_05;

/**
 *
 * @author Dmitry
 */
public class BreakLoop2 {
    public static void main(String[] args) {
        int i=0;
        while(i<100){
            if(i==10)break;
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("Цикл завершён.");
    }
    
}

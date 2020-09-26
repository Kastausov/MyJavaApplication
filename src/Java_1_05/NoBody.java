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
public class NoBody {
    public static void main(String[] args) {
        int i,j;
        i = 100;
        j = 200;
        
        while(i++<--j);
        System.out.println("Среднее значение равно " + i);    
    }
}

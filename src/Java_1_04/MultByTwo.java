/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_04;

/**
 *
 * @author Dmitry
 */
public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;
        for(i=0;i<4;i++){
            num <<= 1;
            System.out.println(num);
           
        }
    }
}

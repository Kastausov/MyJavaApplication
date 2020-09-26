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
public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;
        i=0;
        for(;!done;){
            System.out.println("i равно " + i);
            if(i == 10) done = true;
            i++;
        }
    }
}

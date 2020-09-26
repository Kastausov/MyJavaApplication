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
public class BreakErr {
    public static void main(String[] args) {
        one: {for(int i=0;i<3;i++){
        //one: for(int i=0;i<3;i++){
            System.out.println("Pass " + i + ": ");
            }
            for(int i=0;i<3;i++)
                for(int j=0;j<100;j++){
                if(j==10) break one;
                }
            //}
        }    
    }
}

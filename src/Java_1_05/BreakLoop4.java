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
public class BreakLoop4 {
    public static void main(String[] args) {
        outer: for(int i=0;i<3;i++){
                for(int j=0;j<100;j++){
                if(j==10) break outer;
                System.out.print(j + " ");
                }
                System.out.println("Эта строка не будет выводится.");
            }
        System.out.println("Циклы завершены.");
    }
} 

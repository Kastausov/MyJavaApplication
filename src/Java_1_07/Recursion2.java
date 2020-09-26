/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_07;

/**
 *
 * @author Dmitry
 */
public class Recursion2 {
    public static void main(String[] args) {
        RecTest obj = new RecTest(10);
        int i;
        for(i=0;i<10;i++)obj.values[i]=i;
        obj.printArray(10);
    }
}
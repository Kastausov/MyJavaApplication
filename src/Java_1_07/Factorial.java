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
public class Factorial {
    public int fact(int n){
        return n * (n==2 ? 1 : fact(n-1));
    }
}
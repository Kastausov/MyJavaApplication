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
public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            //int bar =2;
        }
    }
    
}

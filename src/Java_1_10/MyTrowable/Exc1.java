/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_10.MyTrowable;

/**
 *
 * @author Dmitry
 */
public class Exc1 {
    static void subroutine()
    {
    int d = 0;
    int a = 10 / d;
    }    
    
    public static void main(String[] args) 
    {
        Exc1.subroutine();
    }
}

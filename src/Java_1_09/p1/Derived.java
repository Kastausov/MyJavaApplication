/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_09.p1;

/**
 *
 * @author Dmitry
 */
public class Derived extends Protection
{

    public Derived() 
    {
        System.out.println("Конструктор подкласса");
        System.out.println("n = " + n);
        //System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_09.p2;

import Java_1_09.p1.Protection;

/**
 *
 * @author Dmitry
 */
public class OtherPackage 
{
    public OtherPackage() 
    {
        Java_1_09.p1.Protection p = new Java_1_09.p1.Protection();
        System.out.println("Конструктор другого пакета");
        //System.out.println("n = " + p.n);
        //System.out.println("n_pri = " + p.n_pri);
        //System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
   }
}

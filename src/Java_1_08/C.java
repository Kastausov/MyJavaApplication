/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_08;

/**
 *
 * @author Dmitry
 */
public class C extends B
{
    public C() 
    {
        System.out.println("Внутри конструктора C.");
    }
   
    public void callme() {
        System.out.println("Внутри метода callme внутри класса C.");
    }
}

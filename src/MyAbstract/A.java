/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyAbstract;

/**
 *
 * @author Dmitry
 */
public abstract class A
        
{
    abstract void callme();
    
    public void callmetoo()
    {
        System.out.println("Это конкретный метод.");
    }
}

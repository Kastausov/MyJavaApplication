/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInterface;

import MyInterface.InterfaceB;

/**
 *
 * @author Dmitry
 */
public class MyClass implements InterfaceB
{
    public void meth1(){
        System.out.println("Реализация метода meth1().");
    }
    public void meth2(){
        System.out.println("Реализация метода meth2().");
    }
    public void meth3(){
        System.out.println("Реализация метода meth3().");
    }
}

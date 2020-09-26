/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_13;

/**
 *
 * @author Dmitry
 */
public class InstanceOf {
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if(a instanceof A)
            System.out.println("a есть экземпляр A");
        if(b instanceof B)
            System.out.println("b есть экземпляр B");
        if(c instanceof C)
            System.out.println("c есть экземпляр C");
        if(c instanceof A)
            System.out.println("c может быть приведен к A");
        if(a instanceof C)
            System.out.println("a может быть приведен к C");
        System.out.println();
        
        A ob;
        ob = d;
        
        
    }
}

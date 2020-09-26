/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyThread;

/**
 *
 * @author Dmitry
 */
public class A {
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в A.foo");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("A прерван");
        }
        System.out.println(name + " пытается вызвать B.last()");
        b.last();
    }
    synchronized void last(){
        System.out.println("внутри A.last");
    }
}

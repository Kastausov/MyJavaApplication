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
public class B {
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в B.bar");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("B прерван");
        }
        System.out.println(name + " пытается вызвать A.last()");
        a.last();
    }
    synchronized void last(){
        System.out.println("внутри B.last");
    }
}

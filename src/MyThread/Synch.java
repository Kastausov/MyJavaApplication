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
public class Synch {
    public static void main(String[] args) {
        
        CallMe target = new CallMe();
        
        Caller obj1 = new Caller("Добро пожаловать", target);
        Caller obj2 = new Caller("в сихронизованный", target);
        Caller obj3 = new Caller("мир!", target);
        
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано.");
        }
        System.out.println();
    }
}

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
public class HiLoPri {
    public static void main(String[] args) {
        
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        
        Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);
        Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
        
        lo.start();
        hi.start();
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        
        lo.stop();
        hi.stop();
        
        try {
            lo.t.join();
            hi.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        
        System.out.println("Низкоприоритетный поток:  " + lo.click);
        System.out.println("Высокоприоритетный поток: " + hi.click);
    }
}

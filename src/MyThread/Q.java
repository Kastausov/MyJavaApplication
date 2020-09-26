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
public class Q {
    int n;
    boolean valueSet = false;
    synchronized int get(){
        while (!valueSet) {            
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Перехвачено InterruptedException");
            }
        }
        System.out.println("Получено: " + n);
        valueSet = false;
        notify();
        return n;
    }
            
    synchronized void put(int n){
         while (valueSet) {            
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Перехвачено InterruptedException");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Отправлено: " + n);
        notify();
    }
}

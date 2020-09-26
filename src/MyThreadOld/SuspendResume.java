/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyThreadOld;

/**
 *
 * @author Dmitry
 */
public class SuspendResume {
    public static void main(String[] args) {
        
        NewThread obj1 = new NewThread("Первый");
        NewThread obj2 = new NewThread("Второй");
        
        try {
            Thread.sleep(1000);
            //obj1.t.suspend();
            obj1.MySuspend();
            System.out.println("Приостановка первого потока");
            Thread.sleep(1000);
            //obj1.t.resume();
            obj1.MyResume();
            System.out.println("Возобновление первого потока");
            //obj2.t.suspend();
            obj2.MySuspend();
            System.out.println("Приостановка второго потока");
            Thread.sleep(1000);
            //obj2.t.resume();
            obj2.MyResume();
            System.out.println("Возобновление второго потока");
             
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван!");
        }
        try {
            System.out.println("Ожидание завершения выполнения потоков");
            obj1.t.join();
            obj2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван!");
        }
        System.out.println("Главный поток завершен.");
    }
}

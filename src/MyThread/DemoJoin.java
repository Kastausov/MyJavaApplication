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
public class DemoJoin 
{
    public static void main(String[] args) {
        
        NewThread obj1 = new NewThread("Первый");
        NewThread obj2 = new NewThread("Второй");
        NewThread obj3 = new NewThread("Третий");
    
        System.out.println("Первый поток запущен: " + obj1.t.isAlive());
        System.out.println("Второй поток запущен: " + obj2.t.isAlive());
        System.out.println("Третий поток запущен: " + obj3.t.isAlive());
        
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток переван!");
        }
        System.out.println("Первый поток запущен: " + obj1.t.isAlive());
        System.out.println("Второй поток запущен: " + obj2.t.isAlive());
        System.out.println("Третий поток запущен: " + obj3.t.isAlive());
       
        System.out.println("Главный поток завершен.");
    }
}

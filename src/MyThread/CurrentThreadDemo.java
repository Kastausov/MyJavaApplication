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
public class CurrentThreadDemo 
{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текущмй поток: " + t);
        t.setName("Мой Thread");
        System.out.println("После изменения имени: " + t);
        try {
            for(int n = 5;n>0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}

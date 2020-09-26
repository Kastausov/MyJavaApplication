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
public class ThreadDemo 
{
    public static void main(String[] args) {
        NewThread t = new NewThread();
        t.startThread();
        try {
            for(int n = 5;n>0;n--){
                System.out.println("Главный поток n: " + n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}

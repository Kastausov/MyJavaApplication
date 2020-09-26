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
public class NewThread implements Runnable
{
    String name;
    Thread t;
    public NewThread() {
        t = new Thread(this, "Демонстрационный");
        name = t.getName();
        System.out.println("Дочерний поток создан " + t);
        //t.start();
    }

    public NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, threadname);
        System.out.println("Новый поток: " + t);
        t.start();
    }
    
    public void run(){
        try {
            for(int n=5;n>0;n--){
                System.out.println(name + " поток n: " + n);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " поток прерван.");
        }
        System.out.println(name + " поток завершён.");
    }
    public void startThread(){
        t.start();
    }
}

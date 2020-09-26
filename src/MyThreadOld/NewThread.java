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
public class NewThread implements Runnable
{
    String name;
    Thread t;
    boolean suspendFlag;
    
    public NewThread(String threadname) {
        this.name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        suspendFlag = false;
        t.start();
    }
    public void run(){
        try {
            for(int i=15;i>0;i--){
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized(this){
                    while(suspendFlag){
                    wait();
                    }   
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван!");
        }
        System.out.println(name + " завершен.");
    }
    public void MySuspend(){
        suspendFlag = true;
    }
    synchronized public void MyResume(){
        suspendFlag = false;
        notify();
    }
}

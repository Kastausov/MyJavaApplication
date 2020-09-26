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
public class Clicker implements Runnable
{
    long click = 0;
    private volatile boolean running = true;
    Thread t;

    public Clicker(int p) 
    {
        t = new Thread(this);
        t.setPriority(p);
        System.out.println("Создан поток: " + t);
    }

    @Override
    public void run()
    {
        while (running) {            
            click++;
        }
    }
    public void start()
    {
        t.start();
    }
    public void stop(){
        running = false;
    }
}

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
public class Caller implements Runnable
{
    String msg;
    CallMe target;
    Thread t;

    public Caller(String s, CallMe target) {
        this.msg = s;
        this.target = target;
        t = new Thread(this);
        t.start();
    }
    public void run(){
       // synchronized(target){
        target.call(msg);
        //}
    }
}

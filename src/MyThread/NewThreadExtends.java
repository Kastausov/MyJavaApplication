package MyThread;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dmitry
 */
public class NewThreadExtends extends Thread
{
    public NewThreadExtends() {
        super("Демонстрационный поток");
        System.out.println("Дочерний поток создан " + this);
        //start();
    }
    public void run(){
        try {
            for(int n=5;n>0;n--){
                System.out.println("Дочерний поток n: " + n);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершён.");
    }
}

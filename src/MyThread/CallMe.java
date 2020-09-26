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
public class CallMe 
{
synchronized void call(String msg){
//void call(String msg){
    System.out.print("[");
    System.out.print(msg);
//    try {
//        Thread.sleep(500);
//    } catch (InterruptedException e) {
//        System.out.println("Прервано.");
//    }
    System.out.print("]");
}   
}

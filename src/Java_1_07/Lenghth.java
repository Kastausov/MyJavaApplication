/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_07;

/**
 *
 * @author Dmitry
 */
public class Lenghth {
    
    private int[] a1,a2,a3;

    public Lenghth() {
        this.a1 = new int[10];
        this.a2 = new int[]{3,5,7,1,8,99,44,-10};
        this.a3 = new int[]{4,3,2,1};
    }
    
    public void printLen(){
        System.out.println("Размер массива a1 равен " + a1.length);
        System.out.println("Размер массива a1 равен " + a2.length);
        System.out.println("Размер массива a1 равен " + a3.length);
    }
    
    public static void main(String[] args) {
        Lenghth obj = new Lenghth();
        obj.printLen();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_13;

/**
 *
 * @author Dmitry
 */
public class MyThis {
    int a;
    int b;

    public MyThis(int i, int j) {
        a = i;
        b = j;
    }

    public MyThis(int i) {
        //a = i;
        //b = i;
        this(i,i);
    }

    public MyThis() {
        //a = 0;
        //b = 0;
        this(0);
    }
    
    public static void main(String[] args) {
        MyThis mc2 = new MyThis(8);
    }
    
}

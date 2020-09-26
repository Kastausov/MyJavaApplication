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
public class NativeDemo {

    int i;
    
    static {
        try {
            System.loadLibrary("NativeDemo");
        } catch (UnsatisfiedLinkError e) {
          System.err.println("Native code library failed to load.\n" + e);
          System.exit(1);
        }
    } 
    
    public native void test();

    public static void main(String[] args) {
        NativeDemo obj = new NativeDemo();
        obj.i = 10;
        System.out.println("This obj.i before calling the native method: " + obj.i);
        obj.test();
        System.out.println("This obj.i after calling the native method: " + obj.i);
    }
}
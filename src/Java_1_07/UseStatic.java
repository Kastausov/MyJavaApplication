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
public class UseStatic {
    final int FILE_NEW      = 1;
    final int FILE_OPEN     = 2;
    final int FILE_SAVE     = 3;
    final int FILE_SAVEAS   = 4;
    final int FILE_QUIT     = 5;
    
    static int a = 3;
    static int b;
    
    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Статический блок инициализирован.");
        b = a * 4;
    }
    public static void main(String[] args) {
       meth(42);
       UseStatic obj = new UseStatic();
       obj.setA(5);
       meth(42);
       obj.setA(obj.FILE_NEW);
       }

    public void setA(int a) {
        UseStatic.a = a;
    }
}

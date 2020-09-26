/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_10.MyTrowable;

/**
 *
 * @author Dmitry
 */
public class MethNestTry {
    static void nesttry(int a){
        try {
            if(a==1) a = a / (a-a);
            if(a==2){
                int c[] = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива! " + e);
        }
    }
    public static void main(String[] args) {
        String[] _args = {"one","two"};
        try {
            int a = _args.length;
            int b = 42 / a;
            System.out.println("a = " + a );
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль! " + e);
        }
    }    
}

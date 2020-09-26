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
public class OverloadDemo {
    void test(){
        System.out.println("Параметры отсутствуют");
    }
//    void test(int a){
//        System.out.println("a: " + a);
//    }
    void test(int a, int b){
        System.out.println("a и b : " + a + " " + b);
    }
    double test(double a){
        System.out.println("double a: " + a);
        return a*a;
    }
}

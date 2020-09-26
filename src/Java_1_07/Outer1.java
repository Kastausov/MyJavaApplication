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
public class Outer1 {
    int outer_x = 100;
    void test(){
        for(int i=0;i<10;i++){
            class Inner{
            void display(){
                System.out.println("Вывод: outer_x = " + outer_x);
            }
        }
        Inner inner = new Inner();
        inner.display();
        }
    }
}

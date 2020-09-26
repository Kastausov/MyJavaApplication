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
public class RetOb {
    public static void main(String[] args){
        Test obj1 = new Test(2);
        Test obj2;
        
        obj2 = obj1.incrByTen();
        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj2.a = " + obj2.a);
        obj2 = obj2.incrByTen();
        System.out.println("obj2.a после второго увеличения  значения: " + obj2.a);
    }
}

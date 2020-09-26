/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGenerics;

/**
 *
 * @author Dmitry
 */
public class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[] = {3,6,2,8,6};
        Character chs[] = {'b','r','p','w'};
        
        MyClass<Integer>   iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);
        
        System.out.println("Максимальное значение в inums: " + iob.max());
        System.out.println("Минимальное значение в inums: " + iob.min());
        System.out.println("Максимальное значение в chs: " + cob.max());
        System.out.println("Минимальное значение в chs: " + cob.min());
        
    }
}

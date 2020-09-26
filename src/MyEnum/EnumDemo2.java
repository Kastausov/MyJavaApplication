/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyEnum;

/**
 *
 * @author Dmitry
 */
public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Константы Apple:");
        Apple allapples[] = Apple.values();
        for(Apple a : allapples){
            System.out.println(a);
        }
        System.out.println();
        ap = Apple.valueOf("Winesap");
        System.out.println("ap сдержит " + ap);
    }
}

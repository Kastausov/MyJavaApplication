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
public class HierDemo {
    public static void main(String[] args) {
        Gen2<String,Integer> x = new Gen2<String,Integer>("Значение равно: ",99);
        System.out.println(x.getOb());
        System.out.println(x.getOb2());
    }
}

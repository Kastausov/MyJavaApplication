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
public class GenConsDemo {
    public static void main(String[] args) {
        GenCons test1 = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);
        test1.showval();
        test2.showval();
    }
}

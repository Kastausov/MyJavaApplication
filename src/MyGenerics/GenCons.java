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
public class GenCons {
    private double val;
    <T extends Number> GenCons(T arg){
        val = arg.doubleValue();
    }
    void showval(){
        System.out.println("val: " + val);
    }
}

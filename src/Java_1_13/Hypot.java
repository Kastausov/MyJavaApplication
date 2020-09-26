/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_13;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 *
 * @author Dmitry
 */
public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;
        
        //hypot = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
        hypot = sqrt(Math.pow(side1,2) + Math.pow(side2,2));
        
        System.out.println("Даны длины сторон " + side1 + " и " + side2 + " гипотенуза равна " + hypot);
    }
}

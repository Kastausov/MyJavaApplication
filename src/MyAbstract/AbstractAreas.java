/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyAbstract;

import Java_1_08.Figure;
import Java_1_08.Rectangle;
import Java_1_08.Triangle;

/**
 *
 * @author Dmitry
 */
public class AbstractAreas {
    public static void main(String[] args) {
        //Figure f = new Figure(10, 10);
        Rectangle r  = new Rectangle(9,5);
        Triangle t = new Triangle(10, 8);
        Figure figref;
        
        figref = r;
        System.out.println("Площадь равна " + figref.area());
        
        figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}

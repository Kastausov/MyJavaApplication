/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_08;

import Java_1_08.Figure;

/**
 *
 * @author Dmitry
 */
public class Rectangle extends Figure
{

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
   
    public double area()
    {
        System.out.print("Площадь прямоугольника равна: ");
        return dim1 * dim2;
    } 
}

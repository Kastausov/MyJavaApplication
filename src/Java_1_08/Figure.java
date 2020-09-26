/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_08;

/**
 *
 * @author Dmitry
 */
public abstract class Figure 
{
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    public abstract double area();
//    {
//        System.out.print("Площадь фигуры не определена: ");
//        return -1;
//    }
}

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
public class FindAreas
{
    public static void main(String[] args) 
    {
        //Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;
        
//        Object obj;
//        obj = r;
        
        figref = r;
        System.out.println(figref.area());
    
        figref = t;
        System.out.println(figref.area());
        
        //figref = f;
        //System.out.println(figref.area());
    }
}

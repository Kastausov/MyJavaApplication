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
public class Override 
{
    public static void main(String[] args) 
    {
        B subObj = new B(1,2,3);
        subObj.show();
        subObj.show("Это k: ");
    }
}

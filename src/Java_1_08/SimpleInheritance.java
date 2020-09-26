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
public class SimpleInheritance {
    public static void main(String[] args) {
        
        A superObj  = new A();
        B subObj    = new B();
        int _j;
        //superObj.i = 10;
        //superObj.j = 20;
        superObj.setij(10,20);
        System.out.println("Содержимое superObj: ");
        superObj.showij();
        System.out.println();
        
        //subObj.i = 7;
        //subObj.j = 8;
        subObj.setij(7, 8);
        subObj.k = 9;
        
        System.out.println("Содержимое subObj: ");
        subObj.showij();
        subObj.showk();
        System.out.println("");
        System.out.println("Сумма i,j и k равна ");
        subObj.sum(); 
        
    }
}

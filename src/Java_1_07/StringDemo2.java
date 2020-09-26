/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_07;

/**
 *
 * @author Dmitry
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String strObj1 = "Первая строка";
        String strObj2 = "Вторая строка";
        String strObj3 = strObj1;
        
        System.out.println("Длина strObj1: " + strObj1.length());
        System.out.println("Символ с индексом 3 в strObj1: " + strObj1.charAt(3));
        
        if(strObj1.equals(strObj2))
            System.out.println("strObj1 == strObj2");
        else
            System.out.println("strObj1 != strObj2");
    
        if(strObj1.equals(strObj3))
            System.out.println("strObj1 == strObj3");
        else
            System.out.println("strObj1 != strObj3");
        
//        if(strObj1 == strObj3)
//            System.out.println("strObj1 == strObj3");
//        else
//            System.out.println("strObj1 != strObj3");
   }    
}

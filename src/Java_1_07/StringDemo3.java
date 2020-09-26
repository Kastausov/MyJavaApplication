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
public class StringDemo3 {
    public static void main(String[] args) {
        String str[] = {"Один","Два","Три"};
        for(int i=0;i<str.length;i++)
            System.out.println("str[" + i + "] = " + str[i]);
//        for(String strI:str)
//            System.out.println(strI);
    }
}

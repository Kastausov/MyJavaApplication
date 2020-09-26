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
public class OverrideDemo {
    public static void main(String[] args) {
        
       Gen<Integer> iOb = new Gen<Integer>(88);
       Gen2<Integer,Integer> iOb2 = new Gen2<Integer,Integer>(98);
       Gen2<String,String> strOb2 = new Gen2<String,String>("Обобщёный тест");
        
       System.out.println(iOb.getOb()); 
       System.out.println(iOb2.getOb()); 
       System.out.println(strOb2.getOb()); 
        
    }
}

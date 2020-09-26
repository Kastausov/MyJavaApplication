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
public class HierDemo3 {
    public static void main(String[] args) {
     
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen2<Integer,Integer> iOb2 = new Gen2<Integer,Integer>(98);
        Gen2<String,String> strOb2 = new Gen2<String,String>("Обобщёный тест");
        
        if(iOb2 instanceof Gen2<?,?>) System.out.println("iOb2 является экземпляром Gen2");
        if(iOb2 instanceof Gen<?>) System.out.println("iOb2 является экземпляром Gen");
        if(strOb2 instanceof Gen2<?,?>) System.out.println("strOb2 является экземпляром Gen2");
        if(strOb2 instanceof Gen<?>) System.out.println("strOb2 является экземпляром Gen");
        if(!(iOb instanceof Gen2<?,?>)) System.out.println("iOb не является экземпляром Gen2");
        if(iOb instanceof Gen<?>) System.out.println("iOb является экземпляром Gen");
        //if(iOb2 instanceof Gen2<Integer,Integer>) System.out.println("iOb2 является экземпляром Gen2");
        
    }
}

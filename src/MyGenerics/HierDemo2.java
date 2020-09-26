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
public class HierDemo2 {
    public static void main(String[] args) {
        Gen<String> w = new Gen<String>("Добро пожаловать: ",47);
        System.out.print(w.getOb());
        System.out.println(w.getNum());
    }    
}

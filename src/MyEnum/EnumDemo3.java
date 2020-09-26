/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyEnum;

/**
 *
 * @author Dmitry
 */
public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Winesap стоит " + Apple.Winesap.getPrice() + "  центов.\n");
        System.out.println("Все цены яблок: ");
        for(Apple a : Apple.values())
            System.out.println(a + " стоит " + a.getPrice() + " центов.");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyShell;

/**
 *
 * @author Dmitry
 */
public class AutoBox4 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;
        dOb = dOb + iOb;
        System.out.println("dOb после выражения: "  + dOb);
    }
}

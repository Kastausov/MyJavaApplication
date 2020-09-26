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
public class AutoBox5 {
    public static void main(String[] args) {
        Boolean b = true;
        if(b) System.out.println("b равна tyrue");
        Character ch = 'x';
        char ch2 = ch;
        System.out.println("ch2 равна " + ch2);
    }
}

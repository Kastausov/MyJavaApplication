/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyStream;

import java.io.PrintWriter;

/**
 *
 * @author Dmitry
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        
        PrintWriter pw = new PrintWriter(System.out,true);
        pw.println("Это строка");
        
        int i = -7;
        pw.println(i);
        
        double d = 4.5e-7;
        pw.println(d);
        
    }
}

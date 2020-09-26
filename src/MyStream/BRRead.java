/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dmitry
 */
public class BRRead {
    public static void main(String[] args) throws IOException
    {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вводите символы, 'q' - для выхода.");
        
        do {
            c = (char) br.read();
            System.out.println(c);            
        } while(c !='q');
    }
}
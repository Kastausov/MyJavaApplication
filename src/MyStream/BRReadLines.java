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
public class BRReadLines 
{
    public static void main(String[] args) throws IOException
    {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вводите строки текста.");
        System.out.println("Введите stop для завершения.");
        
        do {
            str = br.readLine();
            System.out.println(str);            
        } while(!str.equals("stop"));
    }    
}
       
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
public class TenyEdit 
{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Вводите строки текста.");
        System.out.println("Введите stop для завершения.");
        
        for(int i = 0;i <= 100; i++){
            str[i] = br.readLine();
            if(str[i].equals("stop")) break;
        }
        
        System.out.println("\nВот ваш файл.");
       
        for(int i = 0;i <= 100; i++){
            System.out.println(str[i]);            
            if(str[i].equals("stop")) break;
        } 
    }
}

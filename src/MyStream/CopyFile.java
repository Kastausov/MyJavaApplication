/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Dmitry
 */
public class CopyFile {
        public static void main(String[] args) throws IOException {
        
        int i;
        FileInputStream fin;
        FileOutputStream fout;
        try{
            
            try{
                fin = new FileInputStream(args[0]);
            } catch(FileNotFoundException e){
                System.out.println("Входной файл не найден");
                return;
            }
            try{
                fout = new FileOutputStream(args[1]);
            } catch(FileNotFoundException e){
                System.out.println("Ошибка открытия выходного файла");
                return;
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Использование: CopyFile Исходный Целевой");
            return;
        }    
        
        try{
            do{
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);
        } catch(IOException e){
            System.out.println("Ошибка копирования файла");
        }
        fin.close();
        fout.close();
    }    
}

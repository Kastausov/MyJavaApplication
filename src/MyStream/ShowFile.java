/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Dmitry
 */
public class ShowFile {
    public static void main(String[] args) throws IOException {
        
        int i;
        FileInputStream fin;
        
        try{
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException e){
            System.out.println("Файл не найден");
            return;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Использование: ShowFile файл");
            return;
        }
        
        do{
            i = fin.read();
            if(i != -1) System.out.print((char) i);
        } while(i != -1);
        fin.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInterface;

import MyInterface.Callback;

/**
 *
 * @author Dmitry
 */
public class Client implements Callback
{
    public void callback(int p)
    {
        System.out.println("Метод callback, вызванный со значением " + p);
    }
    
    void nonIfaceNeth()
    {
        System.out.println("Классы, которые реализуют интерфейсы, могут определять так же и другие члены."); 
    }
        
}

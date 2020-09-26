/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInterface;

import MyInterface.AnotherClient;
import MyInterface.Client;
import MyInterface.Callback;

/**
 *
 * @author Dmitry
 */
public class TestIface2 
{
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient obj = new AnotherClient();
        c.callback(42);
        c = obj;
        c.callback(42);
    }    
}

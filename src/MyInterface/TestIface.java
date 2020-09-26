/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInterface;

import MyInterface.Client;
import MyInterface.Callback;

/**
 *
 * @author Dmitry
 */
public class TestIface 
{
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
    
}

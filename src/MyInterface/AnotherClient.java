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
public class AnotherClient implements Callback
{
    public void callback(int p)
    {
        System.out.println("Ещё одна версия callback\n p в квадрате равно " + p*p);
    }
}

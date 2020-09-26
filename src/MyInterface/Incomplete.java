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
abstract class Incomplete implements Callback
{
    int a,b;
    void show(){
        System.out.println(a + " " + b);
    }
}

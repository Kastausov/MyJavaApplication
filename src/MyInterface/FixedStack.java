/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInterface;

import MyInterface.IntStack;

/**
 *
 * @author Dmitry
 */
public class FixedStack implements IntStack
{
    private int stck[];
    private int tos;

    public FixedStack(int size) {
        stck = new int[size];
        tos  = -1;
    }
    
    public FixedStack() {
        stck = new int[10];
        tos  = -1;
    }
    
    public void push(int item){
        if(tos==stck.length-1)
            System.out.println("Стэк переполнен!");
        else stck[++tos] = item;
    }
    
    public int pop(){
        if(tos<0){
            System.out.println("Стэк не содержит элементов!");
            return 0;
            }
        else return stck[tos--];
    }
}

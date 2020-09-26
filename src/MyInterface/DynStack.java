/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInterface;

import MyInterface.IntStack;
import javax.print.DocFlavor;

/**
 *
 * @author Dmitry
 */
public class DynStack implements IntStack 
{
    private int stck[];
    private int tos;

    public DynStack(int size) {
        stck = new int[size];
        tos  = -1;
    }
    
    public DynStack() {
        stck = new int[10];
        tos  = -1;
    }
    
    public void push(int item){
        if(tos==stck.length-1)
        {
            int temp[] = new int[stck.length * 2];
            for(int i=0;i<stck.length-1;i++) temp[i]=stck[i];
            stck = temp;
            stck[++tos] = item;
        }
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_08;

/**
 *
 * @author Dmitry
 */
public class A 
//public final class A 
{
    public int i;//,j;
    private int j;

    public A(int a, int b) {
        this.i = a;
        this.j = b;
    }

    public A() 
    {
        System.out.println("Внутри конструктора A.");
    }
    
    public void setij(int x, int y)
    {
        i = x;
        j = y;
    }

    public int getJ() {
        return j;
    }
    
    public void callme() {
        System.out.println("Внутри метода callme внутри класса A.");
    }
    
    public void showij()
    {
        System.out.println("i и j : " + i + " и " + j);
    }
    
    public void show()
    {
        System.out.println("i и j : " + i + " и " + j);
    }
    
    public final void meth()
    {
        System.out.println("Это метод final.");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_07;

/**
 *
 * @author Dmitry
 */
public class Test {
    public int a,b;
    private int c;
    
    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Test(int i) {
        this.a = i;
    }
    
    public Test() {
        this.a = -1;
        this.b = -1;
    }

    public int getC() {
        return c;
    }

    public void setC(int i) {
        this.c = i;
    }
    
    public boolean equals(Test obj) {
//        if(obj.a == a && obj.b == b) return true;
//        else return false;
           return (boolean)(obj.a == a && obj.b == b);
    }

    public void meth(int i, int j){
        i *= 2;
        j /= 2;
    }

    public void meth(Test obj){
        obj.a *= 2;
        obj.b /= 2;
    }
    
    public Test incrByTen(){
        Test temp = new Test(a+10);
        return temp;
    }
    
}
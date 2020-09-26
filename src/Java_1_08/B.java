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
public class B extends A
{
    int total;
    int i,k;

    public B(int a, int b) {
        super.i = a;
        this.i = b;
    }
    
    public B(int a, int b, int c) {
        super(a,b);
        this.k = c;
    }
    
    public B() {
        System.out.println("Внутри конструктора B.");
        super.i = -1;
        this.i = -1;
    }
    
    public void showk()
    {
        System.out.println("k : " + k); 
    }
   
    public void show()
    {
        super.show();
        showk();
    }
   
    public void callme() {
        System.out.println("Внутри метода callme внутри класса B.");
    }
    
     public void show(String msg)
    {
        System.out.println(msg + k);
    }
   
    public void showSuper()
    {
        System.out.println("i в супер классе: " + super.i); 
        System.out.println("i в подклассе : " + this.i); 
    }
    
    public void sum(){
        //System.out.println("i+j+k : " + (i+j+k));
        System.out.println("i+j+k : " + (i+getJ()+k));
        //total = i + j; 
        total = i + getJ(); 
    }

//    public void meth(){
//    System.out.println("Не допускается переопределение, т.к. метод в родительском классе объявлен как final!");
//    }
}

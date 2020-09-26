/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGenerics;

/**
 *
 * @author Dmitry
 */
public class Gen<T> extends NonGen{
    T ob;

    public Gen(T ob) {
        //super(0);
        this.ob = ob;
    }

    public Gen(T ob, int num) {
        super(num);
        this.ob = ob;
    }

    public T getOb() {
        System.out.print("getOb() класса Gen: ");
        return ob;
    }
    void showType(){
        System.out.println("Типом T является " + ob.getClass().getName());
    }
}

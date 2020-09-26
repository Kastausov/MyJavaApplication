/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGenerics;

/**
 *
 * @author Dmitry
 * @param <T>
 * @param <V>
 */
public class TwoGen<T,V> {
    T ob1;
    V ob2;

    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    public T getOb1() {
        return ob1;
    }    
    
    public V getOb2() {
        return ob2;
    }
    
    void showTypes(){
        System.out.println("Типом T является " + ob1.getClass().getName());
        System.out.println("Типом V является " + ob2.getClass().getName());
    }
}

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
public class Gen2<T,V> extends Gen<T> {
    
    V ob2;
    
    public Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }
    public Gen2(T o) {
        super(o);
    }
    public T getOb() {
        System.out.print("getOb() класса Gen2: ");
        return ob;
    }
    
    public V getOb2(){
        return ob2;
    }
}

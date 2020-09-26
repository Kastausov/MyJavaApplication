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
public class MyClass<T extends Comparable<T>> implements MinMax<T>{
    T[] vals;

    public MyClass(T[] o) {
        vals = o;
    }
    
    public T min(){
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if(v.compareTo(vals[i])<0) v = vals[i];
        }
        return v;
    }
    
    public T max(){
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if(v.compareTo(vals[i])>0) v = vals[i];
        }
        return v;
    }
    
}

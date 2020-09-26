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
public class NoneGen {
    Object ob;

    public NoneGen(Object ob) {
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }
    void showType(){
        System.out.println("Типом ob является " + ob.getClass().getName());
    }    
}

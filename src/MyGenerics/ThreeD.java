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
public class ThreeD extends TwoD {
    int z;
    ThreeD(int a, int b, int c){
        super(a,b);
        this.z = c;
    }
}

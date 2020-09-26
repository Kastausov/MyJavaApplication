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
public class FourD extends ThreeD{
    int t;

    public FourD(int a, int b, int c, int d) {
        super(a, b, c);
        this.t = d;
    }
}

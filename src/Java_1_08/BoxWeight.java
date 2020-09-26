/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_08;

import Java_1_06.Box;

/**
 *
 * @author Dmitry
 */
public class BoxWeight extends Box 
{
    double weight;

    public BoxWeight(){
        super();
        this.weight = -1;
    }

     public BoxWeight(BoxWeight obj)
     {
        super(obj);
        this.weight = obj.weight;
    }

    public BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }

    public BoxWeight( double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }
}

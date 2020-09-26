/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_08;

import Java_1_08.BoxWeight;

/**
 *
 * @author Dmitry
 */
public class Shipment extends BoxWeight
{
    double cost;

    public Shipment(Shipment obj) {
        super(obj);
        this.cost = obj.cost;
    }

    public Shipment() {
        super();
        this.cost = -1;
    }

    public Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }

    public Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }
}

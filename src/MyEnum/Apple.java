/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyEnum;

/**
 *
 * @author Dmitry
 */
public enum Apple {Jonathan(10),GoldenDel(9),RedDel(12),Winesap(15),Cortland(8);
    private final int price;
    private Apple(int p) {price = p;}
    public int getPrice(){return price;}
    }

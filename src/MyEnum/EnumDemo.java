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
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("Значение ap: " + ap);
        System.out.println();
        ap = Apple.GoldenDel;
        if(ap==Apple.GoldenDel)
            System.out.println("ap содержит GoldenDel.\n");
        
        switch(ap){
            case Jonathan:
                System.out.println("Jonathan красный");
                break;
            case GoldenDel:
                System.out.println("GoldenDel желтый");
                break;
            case RedDel:
                System.out.println("RedDel красный");
                break;
            case Winesap:
                System.out.println("Winesap красный");
                break;
            case Cortland:
                System.out.println("Cortland красный");
                break;    
        }
    }
} 

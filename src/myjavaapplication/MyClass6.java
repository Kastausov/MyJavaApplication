/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavaapplication;

/**
 *
 * @author Dmitry
 */
public class MyClass6 {
    public static void main(String[] args) {
        int count, target;
        
        count = target = 1;
        
        switch(count){
            case 1:
                switch(target){
                    case 0:
                        System.out.println("target равно 0");
                        break;
                    case 1:
                        System.out.println("target равна 1");
                        break;
                    default:
                        break;
                }
            break;
        }
    }
}

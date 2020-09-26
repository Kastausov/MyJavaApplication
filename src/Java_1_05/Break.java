/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_05;

/**
 *
 * @author Dmitry
 */
public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println("Предшевствует оператору break.");
                    if(t) break second;
                    System.out.println("Этот оператор не будет выполняться.");
                }
                System.out.println("Этот оператор не будет выполняться.");
            }
            System.out.println("Этот оператор сдедует за блоком second.");
        }
    }
}

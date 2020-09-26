/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_07;

/**
 *
 * @author Dmitry
 */
public class VarArgs {
    static void vaTest(int ... v){
        System.out.print("Количество аргументов: " + v.length + "\nСодержимое: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
        
    }
}
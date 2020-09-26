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
public class NonGen {
    int num;

    public NonGen(int num) {
        this.num = num;
    }
   
    public NonGen() {
         num = 0;
    }
    
    int getNum(){
        return num;
    }
}

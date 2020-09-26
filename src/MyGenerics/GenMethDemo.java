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
public class GenMethDemo {

    static <T, V extends T> boolean isIn(T x, V[] y) {
        for(int i = 0; i < y.length; i++)
            if(x.equals(y[i])) return true;
        return false;
    }
    public static void main(String[] args) {
        Integer nums[] = {1,2,3,4,5};
        if(isIn(2, nums)) System.out.println("2 содержится в nums");
        if(!isIn(7, nums)) System.out.println("7 не содержится в nums");
        System.out.println();
        
        String strs[] = {"один","два","три","четыре","пять"};
        if(isIn("два", strs)) System.out.println("два содержится в strs");
        if(!isIn("семь", strs)) System.out.println("семь не содержится в strs");
        System.out.println();
        
        if(isIn("два", nums)) System.out.println("два содержится в nums");
                else System.out.println("два не содержится в nums");
    }
}
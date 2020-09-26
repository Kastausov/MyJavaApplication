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
public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime = true;
        num =14;
        for(int i=2;i <= num/i;i++){
            if((num%i) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("Простое");
        else System.out.println("Не простое");            
    }
}

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
public class WildcardDemo {
    public static void main(String[] args) {
        
        Integer iNums[] = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<Integer>(iNums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно " + v);
        
        Double dNums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<Double>(dNums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);
    
        Float fNums[] = {1.0F,2.0F,3.0F,4.0F,5.0F};
        Stats<Float> fob = new Stats<Float>(fNums);
        double x = fob.average();
        System.out.println("Среднее значение fob равно " + x);
        
        System.out.print("Средние iob и dob");
        if(iob.sameAge(dob))
            System.out.println(" равны.");
        else
            System.out.println(" отличаются.");
            
        System.out.print("Средние iob и fob");
        if(iob.sameAge(fob))
            System.out.println(" равны.");
        else
            System.out.println(" отличаются.");
        
    }
}

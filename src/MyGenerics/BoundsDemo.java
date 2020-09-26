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
public class BoundsDemo {
    public static void main(String[] args) {
        
        Integer iNums[] = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<Integer>(iNums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно " + v);
        
        Double dNums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<Double>(dNums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);
        
//        String sNums[] = {"1","2","3","4","5"};
//        Stats<String> sob = new Stats<String>(sNums);
//        double s = sob.average();
//        System.out.println("Среднее значение iob равно " + s);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_10.MyTrowable;

/**
 *
 * @author Dmitry
 */
public class SuperSubCatch 
{
    public static void main(String[] args) 
    {
        try {
            int a = 0;
            int b = 42/a;
        }catch (Exception e)
        {
            System.out.println("Общий перехват ошибки/исключения.");
        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("Этот код ни когда не выполнится!");
//        }
    }
}

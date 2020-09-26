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
public class MultiCatch 
{
    public static void main(String[] args) 
    {
    try
        {    
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e)
        {
            System.out.println("Деление на ноль!");
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Попытка присвоить значение не существующему элементы массива!");
        }
    }
}

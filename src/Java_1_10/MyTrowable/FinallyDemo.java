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
public class FinallyDemo 
{
    static void procA()
    {
        try {
            System.out.println("Внутри procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("Блок finally procA");
        }
    }
     static void procB()
    {
        try {
            System.out.println("Внутри procB");
            return;
        } finally {
            System.out.println("Блок finally procB");
        }
    }
     static void procC()
    {
        try {
            System.out.println("Внутри procC");
        } finally {
            System.out.println("Блок finally procC");
        }
    }
    public static void main(String[] args) {
        try {
            procA();
        } catch (RuntimeException e) {
            System.out.println("Исключение перехвачено.");
        }
        procB();
        procC();
    }
}

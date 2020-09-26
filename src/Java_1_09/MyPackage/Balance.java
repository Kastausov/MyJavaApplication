/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_09.MyPackage;

/**
 *
 * @author Dmitry
 */
public class Balance 
{
    String name;
    double bal;

    public Balance(String name, double bal) 
    {
        this.name = name;
        this.bal = bal;
    }
    
    public void show()
    {
        if(bal<0)
            System.out.print("-->");
        System.out.println(name + ": $" + bal);
    }
}

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
public class Switch {
    public static void main(String[] args) {
        int month = 4;
        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println("Время года \"Зима\"");
                break;
            case 3:    
            case 4:    
            case 5:    
                System.out.println("Время года \"Весна\"");
                break;
            case 6:
            case 7:    
            case 8:    
                 System.out.println("Время года \"Лето\"");
                 break;
            case 9:    
            case 10:    
            case 11:    
                System.out.println("Время года \"Осень\"");
                break;
            default:
                System.out.println("Вымышленное время года");
        }
    }
}

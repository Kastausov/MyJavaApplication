/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_06;

/**
 *
 * @author Dmitry
 */
public class Box {
    
    public double width;
    public double height;
    public double depth;

    public Box() {
        //System.out.println("Конструирование объекта \"Box\"");
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box(double width, double height, double depth) {
       // System.out.println("Конструирование объекта \"Box\" c параметрами");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(double len) {
        width = height = depth = len;
    }

    public Box(Box obj) {
        
        this.width  = obj.width;
        this.height = obj.height;
        this.depth  = obj.depth;
    }

    public void printVolume(){
        System.out.print("Объём равен ");
        System.out.println(width * height * depth);
        }
    
    public double volume(){
        return width * height * depth;
        }

    public void setDim(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    protected void finalize() throws Throwable {
        setDim(0,0,0);
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
}

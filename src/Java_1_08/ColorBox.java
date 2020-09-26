/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_08;

import Java_1_06.Box;

/**
 *
 * @author Dmitry
 */
public class ColorBox extends Box
{
    int color;

    public ColorBox(int color, double width, double height, double depth) {
        super(width, height, depth);
        this.color = color;
    }

    public ColorBox(int color, double len) {
        super(len);
        this.color = color;
    }

    public ColorBox(int color, Box obj) {
        super(obj);
        this.color = color;
    }
    
}

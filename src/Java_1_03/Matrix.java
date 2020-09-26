/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_1_03;

/**
 *
 * @author Dmitry
 */
public class Matrix {
    public static void main(String[] args) {
        double matrix[][] = {{1.0*1.0,1.0*2.0,1.0*3.0,1.0*4.0},
                            {2.0*1.0,2.0*2.0,2.0*3.0,2.0*4.0},
                            {3.0*1.0,3.0*2.0,3.0*3.0,3.0*4.0},
                            {4.0*1.0,4.0*2.0,4.0*3.0,4.0*4.0}};
        
        int i,j;
        
        for(i=0;i<4;i++)
            {
            for(j=0;j<4;j++) System.out.print(matrix[i][j] + " ");
            
            System.out.println();
            }
    }
}

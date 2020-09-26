/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApplet;

import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
*/
/**
 *
 * @author Dmitry
 */
public class SimpleApplet extends Applet {
    @Override
    public void paint(Graphics g){
        g.drawString("Простейший аплет", 20, 20);
    }
}

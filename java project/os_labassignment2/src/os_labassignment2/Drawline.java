/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_labassignment2;

/**
 *
 * @author Asus
 */
import javax.swing.*;
import java.awt.Graphics;
public class Drawline extends JPanel{
    
    int x1,y1,x2,y2;
    Drawline(int x1,int y1,int x2,int y2)
    {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
   
    @Override
    public void paint(Graphics g)
    {
       g.drawLine(x1, y1, x2, y2);
    }
}
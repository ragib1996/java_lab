/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_lab_2_netbean;

/**
 *
 * @author Asus
 */
 
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JPanel;
 
public class Page_print extends JPanel {
	int n,pu,l1=100,l2=50,i,t=0,t1;
        JFrame f=new JFrame();
	public Page_print(int n,int pu)
	{
		this.n=n;
		this.pu=pu;
		f.setTitle("Paging ");
		f.setSize(1280,720);
                f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
        JFrame getframe()
        {
            return f;
        }
    	public void paint(Graphics g)
	{
 
                
		for(i=0;i<=n;i++) {
			g.drawRect(100, l1, 70, 40);
                        g.drawString("Page "+i, 100+15, l1+20);
                        t1=t+pu-1;
                        g.drawString(t+" - "+t1, 100-50, l1-50);
                        t=t1+1;
			l1=l1+40;
 
		}
	} 
 
}


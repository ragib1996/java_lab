/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericproject;

/**
 *
 * @author Ragib Mehedi
 */
import javax.swing.JOptionPane;
public class GaussSeidel 
{
    double a1,b1,c1,d1,a2,b2,c2,d2,a3,b3,c3,d3,x,y,z,Eax,Eay,Eaz,xpre,ypre,zpre;
   GaussSeidel()
   {
      a1=Double.parseDouble(JOptionPane.showInputDialog("Your equations are a1x+b1y+c1z=d1, a2x+b2y+c2z=d2, a3x+b3y+c2z=d1\n Enter a1 :"));
      b1=Double.parseDouble(JOptionPane.showInputDialog("Your equations are a1x+b1y+c1z=0, a2x+b2y+c2z=0, a3x+b3y+c2z=0\n Enter b1 :"));
      c1=Double.parseDouble(JOptionPane.showInputDialog("Your equations are a1x+b1y+c1z=0, a2x+b2y+c2z=0, a3x+b3y+c2z=0\n Enter c1 :")); 
      d1=Double.parseDouble(JOptionPane.showInputDialog("Your equations are a1x+b1y+c1z=d1, a2x+b2y+c2z=d2, a3x+b3y+c2z=d1\n Enter d1 :"));
      a2=Double.parseDouble(JOptionPane.showInputDialog("Your equations are a1x+b1y+c1z=0, a2x+b2y+c2z=0, a3x+b3y+c2z=0\n Enter a2 :"));
      b2=Double.parseDouble(JOptionPane.showInputDialog("Your equations are a1x+b1y+c1z=0, a2x+b2y+c2z=0, a3x+b3y+c2z=0\n Enter b2 :"));    
      c2=Double.parseDouble(JOptionPane.showInputDialog("Your equations are a1x+b1y+c1z=0, a2x+b2y+c2z=0, a3x+b3y+c2z=0\n Enter c2 :"));
      d2=Double.parseDouble(JOptionPane.showInputDialog("Your equations are a1x+b1y+c1z=d1, a2x+b2y+c2z=d2, a3x+b3y+c2z=d1\n Enter d2 :"));
      a3=Double.parseDouble(JOptionPane.showInputDialog("Your equations are a1x+b1y+c1z=0, a2x+b2y+c2z=0, a3x+b3y+c2z=0\n Enter a3 :"));
      b3=Double.parseDouble(JOptionPane.showInputDialog("Your equations are a1x+b1y+c1z=0, a2x+b2y+c2z=0, a3x+b3y+c2z=0\n Enter b3 :"));     
      c3=Double.parseDouble(JOptionPane.showInputDialog("Your equations are a1x+b1y+c1z=0, a2x+b2y+c2z=0, a3x+b3y+c2z=0\n Enter c3 :"));
      d3=Double.parseDouble(JOptionPane.showInputDialog("Your equations are a1x+b1y+c1z=d1, a2x+b2y+c2z=d2, a3x+b3y+c2z=d1\n Enter d3 :"));
      x=y=z=0;
   }
  void solution(int iteration)
   {
    xpre=x;
    x=(d1-c1*z-b1*y)/a1; 
    Eax=(x-xpre)/x*100;
    if(Eax<0)
    {
        Eax*=-1;
    }
    ypre=y;
    y=(d2-a2*x-c2*z)/b2;
    Eay=(y-ypre)/y*100;
    if(Eay<0)
    {
        Eay*=-1;
    }
    zpre=z;
    z=(d3-a3*x-b3*y)/c3;
    Eaz=(z-zpre)/z*100;
    if(Eaz<0)
    {
        Eaz*=-1;
    }
     if(Eax<.05&&Eay<.05&&Eaz<.05)
    {
        JOptionPane.showMessageDialog(null, "The solution is \nX="+x+"\nY="+y+"\nZ="+z);
    }
      else
    {
        System.out.println("Iteration n :"+iteration+"\nX="+x+" Ea="+Eax+"\nY="+y+" Ea="+Eay+"\nZ="+z+" Ea="+Eaz);

        solution(iteration+1);
    }
   }
}

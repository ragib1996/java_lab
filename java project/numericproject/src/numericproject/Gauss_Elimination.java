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
import java.util.Vector;
import javax.swing.JOptionPane;
public class Gauss_Elimination 
{
    int n;
    private double[][] a;
    double d[];
    double r[];
   // Vector v=new Vector();
    Gauss_Elimination()
    {
        n=Integer.parseInt(JOptionPane.showInputDialog("Your equation is a11x1+a12x2+a13x3...+a1nxn=d1\na21x1+a22x2+a23x3+...+a2nxn=d2\n...\n...an1x1+an2x2+an3x3+...+annxn=dn\n.Enter number of variables :"));
        a=new double[n][n];
        d=new double[n];
        r=new double[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=Double.parseDouble(JOptionPane.showInputDialog("Enter a"+(i+1)+""+(j+1)));
            }
            d[i]=Double.parseDouble(JOptionPane.showInputDialog("Enter d"+(i+1)));
        }
    }
    public void solution()
    {
        double t;
        // The process of eliminating first term from 2nd 3rd ......
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {   
                t=a[j][i]/a[i][i];
              for(int k=i;k<n;k++)
              {
                  a[j][k]=a[j][k]-a[i][k]*t;
              }
              d[j]=d[j]-d[i]*t;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            r[i]=d[i];
            for(int j=n-1;j>i;j--)
            {
                r[i]=r[i]-r[j]*a[i][j] ;  //// back substitution
            }
            r[i]=r[i]/a[i][i];   
        }
        System.out.println("The solutions are :");
        for(int i=0;i<n;i++)
        {
            System.out.println("x"+(i+1)+" ="+r[i]);
        }
    }
}

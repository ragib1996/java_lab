/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericproject;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Ragib Mehedi
 */
public class Gauss_Jordan 
{
       int n;
    private double[][] a;
    double d[];
    double r[];
   // Vector v=new Vector();
    Gauss_Jordan()
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
    void solution()
    {
        double t;
        for(int i=0;i<n;i++)
        {
            d[i]=d[i]/a[i][i];
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    a[i][j]=a[i][j]/a[i][i];
                }
            }
           a[i][i]=a[i][i]/a[i][i];
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    continue;
                }
                t=a[j][i]/a[i][i];
                for(int k=0;k<n;k++)
                {
                    a[j][k]=a[j][k]-a[i][k]*t;
                }
                d[j]=d[j]-d[i]*t;
            }
           
        }
        System.out.println("The solutions are :");
        for(int i=0;i<n;i++)
        {
            r[i]=d[i];
            System.out.println("X"+(i+1)+" = "+r[i]);
        }
    }
}

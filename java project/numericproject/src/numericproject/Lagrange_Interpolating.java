/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericproject;

import javax.swing.JOptionPane;
/**
 *
 * @author Ragib Mehedi
 */

public class Lagrange_Interpolating {
    int n;
    double datapoints[],f[],x;
    Lagrange_Interpolating()
    {
        n=Integer.parseInt(JOptionPane.showInputDialog("Function is y=ln(x).Enter number of datapoints :"));
        f=new double[n-1];
       
        datapoints=new double[n];
        for(int i=0;i<n;i++)
        {
            datapoints[i]=Double.parseDouble(JOptionPane.showInputDialog("Enter x"+i));
        }
         x=Double.parseDouble(JOptionPane.showInputDialog("Enter your inputs :"));
    }
    
    void solution()
    {
        String s=null;
        double temp1=1,temp2=0;
      Fvalue fv=new Fvalue();
      for(int k=1;k<n;k++)  // it's for order
      {
          f[k-1]=0;
          for(int i=0;i<=k;i++)
          {
              for(int j=0;j<=k;j++)
              {
                 if(j==i)
                 {
                     
                 }
                 else
                 {
                     temp1=temp1*(x-datapoints[j])/(datapoints[i]-datapoints[j]); //Li(x) ber kora hosse
                 }
              }
              f[k-1]=f[k-1]+temp1*fv.ln(datapoints[i]);
              temp1=1;
          }
      }
      for(int i=1;i<n;i++)
      {
          if(i==1)
          {
              s="Using first order polynomial, we get, f"+(i)+"="+f[i-1]+"\n\n";
          }
          else
          {
              s+="Similarly for next order polynomial, we get, f"+i+"="+f[i-1]+"\n\n";
          }
      }
      JOptionPane.showMessageDialog(null, s);
    }
}

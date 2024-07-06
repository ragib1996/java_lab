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
public class Newtonspolynomials {
    double datapoints[],a[][],m=0,b[],ans,error,input;
    int n=0;
    String s=null;
    Newtonspolynomials()
    {
        n=Integer.parseInt(JOptionPane.showInputDialog("Your function is y=ln(x).Enter number of data points :"));
        datapoints=new double[n+1];
        b=new double[n+1];
        a=new double[n][n];
        for(int i=0;i<n;i++)
        {
            datapoints[i]=Double.parseDouble(JOptionPane.showInputDialog("Enter X"+i));
        }
        m=Double.parseDouble(JOptionPane.showInputDialog("Enter another point"));
        datapoints[n]=m; // input is also considered as data points
    }
    String result()
    {
        int i,j;
         ans=0;
         m=1;
         input=Double.parseDouble(JOptionPane.showInputDialog("Enter your input"));
        for( i=0;i<=n;i++)
        {
           if(i==0)
           {
               s=""+b[0];
               ans+=b[0];
           }
           else
           {
                s+="+";
               s+=""+b[i];
               for( j=0;j<i;j++)
               {
                   s+="*(x-"+datapoints[j]+")";
                   m*=(input-datapoints[j]);
               }
              ans+=m*b[j];
           }
           
           m=1;
        }
        
        return s;
    }
   public void solution()
   {
       int k=1;
       Fvalue f=new Fvalue();
     for(int i=0;i<=n-1;i++) // 1st row of a
     {
         for(int j=0;j<n-i;j++)  // columns of a
         {
             if(i==0)
             {
                 a[i][j]=(f.ln(datapoints[j+1])-f.ln(datapoints[j]))/(datapoints[j+1]-datapoints[j]);
             }
             else
             {
                 a[i][j]=(a[i-1][j+1]-a[i-1][j])/(datapoints[j+k]-datapoints[j]);
             }
         }
         k++;
     }
     for(int i=0;i<=n;i++)
     {
         if(i==0)
         {
             b[i]=f.ln(datapoints[i]);
         }
         else
         {
              b[i]=a[i-1][0];
         }
        
     }
     result();
     error=(f.ln(input)-ans)*100/f.ln(input);
     if(error<0)
     {
         error*=-1;
     }
     JOptionPane.showMessageDialog(null,"y="+s+"\nans : "+ans+"\n"+"Error : "+error+"%");
   }
}

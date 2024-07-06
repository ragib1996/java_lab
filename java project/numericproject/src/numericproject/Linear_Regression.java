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
public class Linear_Regression {
    int n;
    double x[],y[],xiyi=0,xi=0,xi2=0,yi=0,a1=0,a0=0,xavg=0,yavg=0; // xiyi=sum(xiyi), same as xi,yi xi2=Xi^2
    Linear_Regression()
    {
      n=(int) Double.parseDouble(JOptionPane.showInputDialog("Enter num of data items : "));
      x=new double[n];
      y=new double[n];
      for(int i=0;i<n;i++)
      {
          x[i]=Double.parseDouble(JOptionPane.showInputDialog("Enter x"+(i+1)));
          y[i]=Double.parseDouble(JOptionPane.showInputDialog("Enter y"+(i+1)));
          xi=xi+x[i];
          yi=yi+y[i];
          xi2=xi2+x[i]*x[i];
          xiyi=xiyi+x[i]*y[i];
      }
      xavg=xi/n;
      yavg=yi/n;
    }
    void solution()
    {
        a1=(n*xiyi-xi*yi)/(n*xi2-xi*xi);
        a0=yavg-a1*xavg;
        JOptionPane.showMessageDialog(null,"y="+a0+"+"+a1+"x");
    }
}

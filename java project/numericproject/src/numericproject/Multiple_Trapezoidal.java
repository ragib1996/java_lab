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
public class Multiple_Trapezoidal {
    
    double a1,a2,a3,a4,a5,c,a,b,datapoints[],ans=0,error;
    int n;
    Multiple_Trapezoidal(){
      c=Double.parseDouble(JOptionPane.showInputDialog("Your function is f(x)=c+a1x+a2x^2+a3x^3+a4x^4+a5x^5. Enter c :"));
      a1=Double.parseDouble(JOptionPane.showInputDialog("Your function is f(x)=c+a1x+a2x^2+a3x^3+a4x^4+a5x^5. Enter a1 :"));
      a2=Double.parseDouble(JOptionPane.showInputDialog("Your function is f(x)=c+a1x+a2x^2+a3x^3+a4x^4+a5x^5. Enter a2 :"));
      a3=Double.parseDouble(JOptionPane.showInputDialog("Your function is f(x)=c+a1x+a2x^2+a3x^3+a4x^4+a5x^5. Enter a3 :"));
      a4=Double.parseDouble(JOptionPane.showInputDialog("Your function is f(x)=c+a1x+a2x^2+a3x^3+a4x^4+a5x^5. Enter a4 :"));
      a5=Double.parseDouble(JOptionPane.showInputDialog("Your function is f(x)=c+a1x+a2x^2+a3x^3+a4x^4+a5x^5. Enter a5 :"));
      n=Integer.parseInt(JOptionPane.showInputDialog("Enter number of interval :"));
      datapoints =new double[n+1];
      a=Double.parseDouble(JOptionPane.showInputDialog("Enter lower limit a : "));
      b=Double.parseDouble(JOptionPane.showInputDialog("Show upper limit b : "));
      double h=(b-a)/n;
      for(int i=0;i<=n;i++){
          if(i==0){
              datapoints[i]=a;
          }
          else{
              datapoints[i]=datapoints[i-1]+h;
          }
      }
    }
    double fvalue(double d)
    {
        double r;
        r=c+a1*d+a2*d*d+a3*d*d*d+a4*d*d*d*d+a5*d*d*d*d*d;
        return r;
    }
    double integrated_value(double d)
    {
        double r;
        r=c*d+a1*d*d/2+a2*d*d*d/3+a3*d*d*d*d/4+a4*d*d*d*d*d/5+a5*d*d*d*d*d*d/6;
        return r;
    }
   
    void solution(){
        double parsenterror,truevalue;
        for(int i=0;i<=n;i++){
            if(i==0||i==n){
                ans=ans+fvalue(datapoints[i]);
            }
            else{
                ans=ans+2*fvalue(datapoints[i]);
            }
        }
        ans=ans*(b-a)/(2*n);
        truevalue=integrated_value(b)-integrated_value(a);
        error=((integrated_value(b)-integrated_value(a))-ans);
        parsenterror=((truevalue-ans)/truevalue)*100;
        JOptionPane.showMessageDialog(null, " Result of integration ,I= "+ans+"\n\nEt : "+error+"\n\nParsentage Error :"+parsenterror);
    }
}

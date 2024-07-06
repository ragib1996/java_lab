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
public class Numericproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        double tv;
        int i=Integer.parseInt(JOptionPane.showInputDialog("Which process you want to apply \n1.Bisection\n2.Fixed Point Iteration Method\n3.Newton Rapson Method\n4.Gauss Elemination\n5.Gauss Jordan\n6.Gauss Seidel\n7.Newton's Divided Difference Interpolation\n 8.Lagrange Interpolating Polinomial \n9.Linear Regression\n10.Multiple trypezoidal"));

      if(i==1)
      {
                    
        double a= Double.parseDouble(JOptionPane.showInputDialog("Your equation is ax^2+bx+c=0.\n Enter a"));
        double b=Double.parseDouble(JOptionPane.showInputDialog("Your equation is ax^2+bx+c=0.\n Enter b"));
        double c= Double.parseDouble(JOptionPane.showInputDialog("Your equation is ax^2+bx+c=0.\n Enter c"));
       
      // System.out.println(a+"\n"+b+"\n"+c+" \n"+Xu+"\n"+Xl+"\n");
        double tv1=(-b+Math.sqrt(b*b-4*c*a))/(2*a);
        double   tv2=(-b-Math.sqrt(b*b-4*c*a))/(2*a);
        double Xu=Double.parseDouble(JOptionPane.showInputDialog("Enter upper limit,Xu :"));
        double Xl=Double.parseDouble(JOptionPane.showInputDialog("Enter lower limit,Xl :"));
        Bisection B=new Bisection();
        if(tv1>= Xl && tv1<= Xu)
        {
             tv=tv1;
        }
        else
        {
             tv=tv2;
        }
        double ans= B.solution(a, b, c, Xu, Xl,tv);
        JOptionPane.showMessageDialog(null, ans);
      }  
      else if(i==2)
      {
         double a= Double.parseDouble(JOptionPane.showInputDialog("Your equation is ax^2+bx+c=0.\n Enter a"));
         double b=Double.parseDouble(JOptionPane.showInputDialog("Your equation is ax^2+bx+c=0.\n Enter b"));
         double c= Double.parseDouble(JOptionPane.showInputDialog("Your equation is ax^2+bx+c=0.\n Enter c"));
         double iniguess=Double.parseDouble(JOptionPane.showInputDialog("Your equation is ax^2+bx+c=0.Enter initial guess :"));
         FixedPointMethod F=new FixedPointMethod();
         double ans = F.solution(a, b,c,iniguess);
         JOptionPane.showMessageDialog(null, ans);
         System.out.println(ans);
       } 
      else if(i==3)
      {
          double a= Double.parseDouble(JOptionPane.showInputDialog("Your equation is ax^2+bx+c=0.\n Enter a"));
          double b=Double.parseDouble(JOptionPane.showInputDialog("Your equation is ax^2+bx+c=0.\n Enter b"));
          double c= Double.parseDouble(JOptionPane.showInputDialog("Your equation is ax^2+bx+c=0.\n Enter c"));
          double iniguess=Double.parseDouble(JOptionPane.showInputDialog("Your equation is ax^2+bx+c=0.Enter initial guess :"));
          NewtonRapsion N=new NewtonRapsion();
          double ans=  N.solution(a, b, c, iniguess);
          JOptionPane.showMessageDialog(null, ans);
      }
      else if(i==4)
       {
           //GaussElemination g = new GaussElemination();
          // g.solution();
           Gauss_Elimination gj =new Gauss_Elimination();
           gj.solution();
       }
      else if(i==5)
       {
           Gauss_Jordan gj=new Gauss_Jordan();
           gj.solution();
        
       }
      else if(i==6)
       {
           GaussSeidel gs=new GaussSeidel();
           gs.solution(1);
       }
      else if(i==7)
       {
          Newtonspolynomials n= new     Newtonspolynomials();
          n.solution();
       }
      else if(i==8)
       {
          Lagrange_Interpolating l=new Lagrange_Interpolating();
          l.solution();
           
       }
      else if(i==9)
       {
           Linear_Regression line =new Linear_Regression();
           line.solution();
       }
      else
      {
          Multiple_Trapezoidal m=new Multiple_Trapezoidal();
          m.solution();
      }
     } 
    }   


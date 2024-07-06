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
public class Fvalue {
    double r;
    public  double f(double a,double b,double c,double Xr)   // for bisection && Newton Rapsion
    {
        r=  a*Math.pow(Xr,(double)2)+b*Xr+c;
        return r;
    }
    public double f2(double a,double b,double c,double Xr) // fixed point iteration
    {
       r=-c/(a*Xr+b);  //-1.644
       
      // r=-b/a-c/(a*Xr); // shoule be checked
     // r=(-c/b)/(a*Xr/b+1); //-1.644
     // r=-c/(a*b*(Xr/b+1/a));  //-1.644
        return r;
    }
   /* public double f3(double a,double b,double c,double Xr) for another answer in fixed point iteration
    {
         r=-(b+c/Xr)/a; //  is not applicable here  //7.144
         return r;
    } */
    public double f4(double a,double b, double Xr) // for Newtion Rapsion one time derivative
    {
        r=2*a*Xr+b;
        return r;
    }
    public double ln(double n)
    {
        r=Math.log(n);
        return r;
    }
}

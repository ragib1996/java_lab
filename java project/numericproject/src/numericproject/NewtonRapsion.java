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
public class NewtonRapsion {
   double Xr,Xi1,Xi2,Ea;
   Fvalue fv=new Fvalue();
   double solution(double a,double b,double c,double Xr)
   {
       Xi1=Xr;
       Xi2=Xi1-fv.f(a, b, c, Xr)/fv.f4(a, b, Xr);
       Ea=((Xi2-Xi1)/Xi2)*100;
       if(Ea<0)
       {
           Ea*=-1;
       }
       if(Ea<.01)
       {
           return Xi2;
       }
       return solution(a,b,c,Xi2);
}
}

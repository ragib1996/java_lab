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
public class FixedPointMethod {
    double Xr,Xi1,Xi2;
    Fvalue fv=new Fvalue();
    double solution(double a,double b,double c,double Xi)
    {
        Xi1=Xi;
       Xi2= fv.f2(a, b, c,Xi);
       double Ea=((Xi2-Xi1)/Xi2)*100;
       if(Ea<0)
       {
           Ea*=-1;
       }
       if(Ea>.01)
       {
           Xi1=Xi2;
           solution(a,b,c,Xi1);
       } 
       return Xi2;
    }
}

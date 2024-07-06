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
import java.lang.Math;
//import static java.lang.Math.sqrt;

public class Bisection {
    double Xr,Ea,Et=Ea=100,tv1,tv2;
    Fvalue fv=new Fvalue();
    double  solution(double a, double b,double c,double Xu,double Xl,double tv) 
    {
        
        Xr=(Xu+Xl)/2;
        Et=(tv-Xr)/tv *100;
        if(Et<0)
        {
            Et*=-1;
        }
        if(Et>.01)
        {
            if(fv.f(a, b, c, Xr)*fv.f(a, b, c, Xl)<0)
            {
                Xu=Xr;
            }
            else
            {
                Xl=Xr;
            }
            solution( a,  b, c, Xu, Xl,tv) ;
        }
       
        return  Xr;
    }      
}

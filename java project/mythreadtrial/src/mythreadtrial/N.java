/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythreadtrial;

/**
 *
 * @author Ragib Mehedi
 */
public class N extends Thread{
    int i,j;
  public  void run()
    {
       for(i=0;i<=20;i++)
       {
           try
           {
               System.out.println("N class "+i);
               Thread.sleep(100);
           }
           catch(Exception e)
           {
               
           }
       }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.thread;

/**
 *
 * @author Ragib Mehedi
 */
public class A extends Thread{
     @Override
   public void run()
    {
        for(int i=0;i<100;i++)
        {
           System.out.println("I am in Thread A");
           if(i==1)
           {
              stop();
           }
        }
        System.out.println("Exit from Thread A");
    } 
   
}

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
public class MyThread extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A objA=new A();
         B objB=new B();
        objA.start();
        objB.start();
    }
    
}

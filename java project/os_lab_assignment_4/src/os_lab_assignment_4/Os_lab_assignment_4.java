/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_lab_assignment_4;

/**
 *
 * @author Asus
 */ 
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Os_lab_assignment_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        int d=Integer.parseInt(JOptionPane.showInputDialog("Which process you should apply:\n1.FIFO\n2.LRU\n3.Optimal\n4.NRU"));
        System.out.println("Enter number of pages :");
        int num_pages=sc.nextInt();
        String a[] = new String [num_pages];
        for(int i=0;i<num_pages;i++)
        {
            a[i]=sc2.nextLine();
         
        }
        System.out.println("Enter number of frame :");
        int num_frame= sc.nextInt(); 
     // int a[]={7,0,1,2,0,3,0,4,2,3,0,3,2,1};
     // int d=Integer.parseInt(JOptionPane.showInputDialog("Which process you want to apply \n1.Bisection\n2.Fixed Point Iteration Method\n3.Newton Rapson Method\n4.Gauss Elemination\n5.Gauss Jordan\n6.Gauss Seidel\n7.Newton's Divided Difference Interpolation\n 8.Lagrange Interpolating Polinomial \n9.Linear Regression\n10.Multiple trypezoidal"));   
           if(d==1)
        {
             FIFO f=new FIFO(a.length,a,num_frame);
             f.presentation();;
        }
        else if(d==2)
        {
             LRU l=new LRU(a.length,a,num_frame);
           l.presentation(); 
        }
        else if(d==3)
        {
              Optimal op = new Optimal(a.length,a,num_frame);
              op.presentation();
        }
        else if(d==4)
        {
            NRU n= new NRU(a.length,a,num_frame);
            n.presentation();
        }
     
    }
    
}

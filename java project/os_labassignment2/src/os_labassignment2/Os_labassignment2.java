/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_labassignment2;

/**
 *
 * @author Asus
 */
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JScrollPane;
public class Os_labassignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector v=new Vector();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter process size or logical memory size in Kilobites :");
        int process_size=sc.nextInt();
        System.out.println("Enter main memory size in kilobites :");
        int ram=sc.nextInt();
        System.out.println("Enter paging unit size int kilobites :");
         int unit=sc.nextInt();
        int logical_memorynumber=process_size/unit;
        int physical_memorynumber=ram/unit;
        JFrame f=new JFrame();
        JLabel l;
        JButton bt;
        int p1,f1;
        int a=process_size,b=a-unit;
        // label for Logical memory
        l=new JLabel("Virtual Memory ");
        
        l.setBounds(100, -25, 200, 75);
        f.add(l);
        for(int i=1;i<=logical_memorynumber;i++)
        {
            l=new JLabel(b+"k-"+a+"k");
            l.setBounds(0, 50*(i), 100, 50);
            f.add(l);
            a=a-unit;
            b=a-unit;
        }
        // button for page
        for(int i=logical_memorynumber;i>=1;i--)
        {
            bt=new JButton("Page no "+(i-1));
            bt.setBounds(100, 50*(logical_memorynumber-i+1), 100, 50);
            f.add(bt);
        }
        a=ram;
        b=ram-unit;
        l=new JLabel("  Page Table  ");
        l.setBounds(800, -25, 250, 75);
        f.add(l);
        l=new JLabel("Physical Memory   ");
        l.setBounds(400, -25, 250, 75);
        f.add(l);
        for(int i=1;i<=physical_memorynumber;i++)
        {
            // for pagetable
            System.out.println("Enter page  and frame :");
            p1=sc.nextInt();
            f1=sc.nextInt();
            v.add(p1);
            v.add(f1);
            bt=new JButton("Page no "+p1);// pagetable
            bt.setBounds(800, 50*(i), 100, 50);
             f.add(bt);
            bt=new JButton("Frame no "+f1);
            bt.setBounds(900, 50*(i), 150, 50);
            f.add(bt);
            // page table complete
            
            // physical memory or ram
            bt=new JButton("Frame no "+(physical_memorynumber-i));
            bt.setBounds(400, 50*(i), 100, 50);
            f.add(bt);
            l=new JLabel(b+"k-"+a+"k");
            l.setBounds(500, 50*(i), 100, 50);
            f.add(l);
            a=a-unit;
            b=a-unit;
           /* int x1=200;
            int y1=(logical_memorynumber-(p1+1))*50+25;
            int x2=400;
            int y2=(physical_memorynumber-(f1+1)*50)+25;
              Drawline d= new    Drawline(x1,x2,y1,y2);
              f.add(d); */
        }
           f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        System.out.println("Enter a logical address you want to find position in frame :");
        int address=sc.nextInt();
        
        double temp=(double)address/(1024*unit);
       // int address_page=(int)Math.ceil(temp)-1;
       // address_page=address_page/unit;
        int e=address%(unit*1024);
        int address_page=address/(1024*unit);
        /*if(e!=0)
        {
              address_page=(int)Math.ceil(temp)-1;
        }
        else
        {
              address_page=(int)Math.ceil(temp);
        } */
        boolean bee=v.contains(address_page);
        int ans=1;
        if(bee== true)
        {
            for(int i=0;i<v.size();i+=2)
            {
                if(address_page==(int)v.get(i))
                {
                    ans=i; // ans= pageindex
                    break;
                }
            }
        }
        if(bee==true &&  ans%2==0)
        {
           
            
                 System.out.println("Your given address is in frame "+v.get(ans+1));
                 int t=(int)v.get(ans+1)*unit*1024;
               System.out.println("Position of your given logical address is in physical memory :"+((int)v.get(ans+1)*unit*1024+e));
            
        }
        else
        {
             System.out.println("Your given address is not in the frame " );
        }
    }
    
}

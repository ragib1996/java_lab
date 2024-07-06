/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oslabassinment_3;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
public class Oslabassinment_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,k,seg_no,base,limit;
        Vector v1=new Vector();
        Vector v2=new Vector();
        Vector v3=new Vector();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of segment :");
        int num_segment=sc.nextInt();
        System.out.println("Enter size of physical memory size :");
        int physical_size=sc.nextInt();
        for(i=0;i<num_segment;i++)
        {
            System.out.println("Enter segment no : ");
            seg_no=sc.nextInt();
            System.out.println("Enter base of segment no "+seg_no+" :");
            base=sc.nextInt();
            System.out.println("Enter limit of segment  of segment "+seg_no+" : ");
            limit=sc.nextInt();
            if(i==0)
            {
                v1.add(seg_no);
                v2.add(base);
                v3.add(limit);
            }
            else
            {
                for(j=0;j<v2.size();j++)
                {
                    if(base<=(int)v2.get(j))
                    {
                        v1.add(j,seg_no);
                        v2.add(j,base);
                        v3.add(j,limit);
                        break;
                    }
                }
                if(j==v2.size())
                {
                    v1.add(seg_no);
                    v2.add(base);
                    v3.add(limit);
                }
            }
        }
        JFrame f=new JFrame();
        JButton b;
        int s=10;
        // segmentation part
        for(i=0;i<num_segment;i++)
        {
            
            if(i==0)
            {    
            b=new JButton("Segment "+v1.get(i));
            b.setBounds(0, 10, 120,(int) v3.get(i)*2);
            f .add(b);
            s=10+(int) v3.get(i)*2+10;
            }
            else
            {
                b=new JButton("Segment "+v1.get(i));
                b.setBounds(0, s, 120,(int) v3.get(i)*2);
                f.add(b);
                s=s+10+(int) v3.get(i)*2;
            }
        }
        
        // for segmentation table
        JLabel l=new JLabel("Segment Table");
        l.setBounds(350, 0, 100, 50);
        f.add(l);
        for(i=0;i<num_segment;i++)
        {
            b=new JButton("Segment "+(int)v1.get(i));
            b.setBounds(250, (i+1)*50, 100, 50);
            f.add(b);
             b=new JButton("Base "+(int)v2.get(i));
            b.setBounds(350, (i+1)*50, 100, 50);
            f.add(b);
             b=new JButton("Limit "+(int)v3.get(i));
            b.setBounds(450, (i+1)*50, 100, 50);
            f.add(b);
            
        }
        s=50;
        // physical memory
          l=new JLabel("Physical memory");
        l.setBounds(750, 0, 100, 50);
        f.add(l);
        /*for(i=0;i<num_segment;i++)
        {
            l=new JLabel();
        } */
        int t;
        for(i=0;i<num_segment;i++)
        {
            if(i==0)
            {
                   l=new JLabel("0");
                l.setBounds(700, 0, 50, 100);
                f.add(l);
            }
            if(s<(int) v2.get(i)*2+50 && i==0)
            {
                b=new JButton();
                b.setBounds(750, (i+1)*50, 120,(int) v2.get(i)*2);
                f.add(b);
                t= (int) v2.get(i);
                l=new JLabel(""+(int) v2.get(i));
                l.setBounds(700, (int) v2.get(i)*2-10+(i+1)*50, 50, 20);
                f.add(l);
            }
            else if(s<(int) v2.get(i)*2+50)
            {
                 b=new JButton();
                b.setBounds(750, s, 120,(int) v2.get(i)*2+50-s);
                t=(int)v2.get(i);
                l=new JLabel(""+((int)v2.get(i)));
                t=(int)v2.get(i)*2+50-s-10;
                l.setBounds(700, s+(int)v2.get(i)*2+50-s-10, 50, 20);
                f.add(l);
                f.add(b);
            }
            b=new JButton("Segment "+v1.get(i));
            b.setBounds(750, (int)v2.get(i)*2+50, 120, (int) v3.get(i)*2);
            f.add(b);
            t=(int)v2.get(i)+(int)v3.get(i);
            l=new JLabel(""+((int)v2.get(i)+(int)v3.get(i)));
            t= (int)v2.get(i)*2+50+(int) v3.get(i)*2-10;
            l.setBounds(700, (int)v2.get(i)*2+50+(int) v3.get(i)*2-10, 50, 20);
            f.add(l);
            s=(int) v3.get(i)*2+ (int)v2.get(i)*2+50;
        }
        if(s<physical_size*2+50)
        {
            b=new JButton();
            b.setBounds(750, s, 120, physical_size*2+50-s);
            f.add(b);
            l=new JLabel(""+physical_size);
            l.setBounds(700, physical_size*2+50-10, 50, 20);
            f.add(l) ;
        }
        System.out.println("Enter any logical memory address(Segment number and offset :)");
        int seg=sc.nextInt();
        int offset=sc.nextInt();
        if(seg<num_segment && offset<=(int)v3.get(seg))
        {
            for(i=0;i<v1.size();i++)
            {
                if(seg==(int)v1.get(i))
                {
                    System.out.println("Physical address is "+((int)v2.get(i)+offset));
                    break;
                }
            }
        }
        else
        {
            System.out.println("Invalid address");
        }
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        }
    
}

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

import java.util.Vector;
import java.util.LinkedList;
import java.util.Queue;   
import javax.swing.*;
public class LRU {
    
    
    int num_pages,num_frame,page_fault=0;
    String a[],inframe[];
    LRU(int num_pages, String a[],int num_frame)
    {
        this.num_frame=num_frame;
        this.a=a;
        this.num_pages=num_pages;
        inframe=new String[this.num_frame];
        for(int i=0;i<num_frame;i++)
        {
            inframe[i]=null;
        }
    }
     boolean iscontain(String s)
    {
       
        String s1=s;
      for(int i=0;i<num_frame;i++)
      {
          String s2=(String)inframe[i];
          if(s1.equals(s2)==true)
          {
              return true;
          }
      }
      return false;
    }
     int index(String a[],String s)
     {
        
         String s1=s;
         for(int i=0;i< num_frame;i++)
         {
             String s2=inframe[i];
             if(s2.equals(s1)==true)
             {
                 return i;
             }
             
         }
         return -1;
     }
    void presentation()
    {
        JFrame f=new JFrame();
       /* JButton b=new JButton("70");
        JButton b2=new JButton("80");
        b.setBounds(0, 10, 50, 50);
        b2.setBounds(0, 60, 50, 50);
        JButton b3=new JButton("25");
        JButton b4= new JButton ("30");
        b3.setBounds(60, 10, 50, 50);
        b4.setBounds(60, 60, 50, 50);
        f.add(b3);
        f.add(b4);
        f.add(b);
        f.add(b2);
        Queue q=new LinkedList();
        JLabel l=new JLabel("0");
        l.setBounds(20, 0, 50, 10);
        JLabel l2=new JLabel("1");
        l2.setBounds(80, 0, 50, 10); 
        f.add(l);
        f.add(l2); */
       int i,j=0,column;
       int k;
       JLabel l;
       JButton button;
        Queue<String> q=new LinkedList();
        for(i=0;i<num_pages;i++) // i is column
        {
         
            boolean b=iscontain(a[i]);
            if(b==true)
            {
                 l=new JLabel(""+a[i]);
                 l.setBounds(20+60*i, 0, 50, 10);
                 f.add(l);
                continue;
            }
            else
            {
                page_fault++;
                for(j=0;j<num_frame;j++)
                {
                    if(inframe[j]==null)
                    {
                        inframe[j]=a[i];
                    //    q.add(a[i]);
                        break;
                    }
                }
                /*if(j==num_frame)
                {
                    k=(String)q.peek();
                    int in=index(inframe,k);
                    q.poll();
                    inframe[in]=a[i];
                    q.add(a[i]);
                } */
                k=0;/*
                if(j==num_frame)
                {
                    int far=i+1;
                    for(j=0;j<num_frame;j++)
                    {
                        for(k=i+1;k< a.length;k++)
                        {
                            if(a[k].equals(inframe[j]))
                            {
                                if(k>far)
                                {
                                    far=k;
                                }
                                break;
                            }
                        }
                        if(k==a.length)
                        {
                            far=k;
                            break;
                        }
                    }
                    if(far<a.length)
                    {    
                    int in=index(inframe,a[far]);
                    inframe[in]=a[i];
                    }
                    else
                    {
                        inframe[j]=a[i];
                    }
                } */
                if(j==num_frame)
                {
                    int far = i-1;
                    for(j=0;j < num_frame;j++)
                    {
                        for(k=i-1;k>=0;k--)
                        {
                            if(inframe[j].equals(a[k]) )
                            {
                                break;
                            }
                        }
                        if(k>=0 && far > k)
                        {
                            far=k;
                        }
                    }
                    int in=index(inframe,a[far]);
                    inframe[in]=a[i];
                }
            }
            l=new JLabel(""+a[i]);
            l.setBounds(20+60*i, 0, 50, 10);
            f.add(l);
            for(j=0;j<num_frame;j++)
            {
                if(inframe[j]!=null)
                {
                    button=new JButton(""+inframe[j]);
                }
                else
                {
                    button=new JButton();
                }
                button.setBounds((10+50)*i, 20+50*j, 50, 50);
                f.add(button);
            }
        }
        f.setBounds(0, 0, 1000, 1000);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        System.out.println("Number of page fault "+page_fault);
    }
}


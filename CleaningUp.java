
package prac2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CleaningUp 
{
    public static void main(String [] args)
    {
       int t,j,i,n,m,y[],x;
       
       
       Scanner in=new Scanner(System.in);
       t=in.nextInt();
       for(j=0;j<t;j++)
       {   ArrayList <Integer> a=new ArrayList <Integer>();
           n=in.nextInt();
           
           for(i=1;i<=n;i++)
           {
               a.add(i); 
           }
          
           m=in.nextInt(); 
           y=new int[m];
                for(i=0;i<m;i++)   
                {
                    y[i]=in.nextInt();                  
                }
                Arrays.sort(y);
                
                for(i=0;i<m;i++)
                {
                    if(y[i]>i)
                    {
                        a.remove(y[i]-(i+1));
                    }
                    else
                    {
                        a.remove(y[i]-(i-1));
                    }
                }
           x=a.size();
           for(i=0;i<x;i++)
           {
               if(i%2==0)
               {
                   System.out.print(a.get(i)+"\t");
               }
           }
            System.out.println();
           for(i=0;i<x;i++)
           {
               if(!(i%2==0))
               {
                   System.out.print(a.get(i)+"\t");
               }
           }
           System.out.println();
           
       }
    }
}

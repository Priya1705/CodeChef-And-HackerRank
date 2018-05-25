package prac2;
import java.util.ArrayList;
import java.util.Scanner;

public class BoringAssignments {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int m,n,N[],i,j,max=0,k,sum1,sum2,grt,min=10000000;
        
        m=in.nextInt();
        n=in.nextInt();
        N=new int[m];
        for(i=0;i<m;i++)
        {
            N[i]=in.nextInt();
        }       
        //if n==m
        if(n==m)
        {
            for(i=0;i<m;i++)
            {
                if(N[i]>max)
                {   
                    max=N[i];
                }
                System.out.println(max);
            }
        }
        else
        {
            //half
            for(i=0;i<m-1;i++)
            {
            //division of arrays is done
            ArrayList<Integer> al1=new ArrayList<Integer>();
            ArrayList<Integer> al2=new ArrayList<Integer>();
                for(j=0;j<=i;j++)
                {
                    al1.add(N[j]);
                }
                for(k=i+1;k<m;k++)
                {
                    al2.add(N[k]);
                }
                sum1=0;sum2=0;
                for(k=0;k<al1.size();k++)
                {
                    // System.out.println("al1: "+al1.get(k)); 
                     sum1+=al1.get(k);
                }
                for(k=0;k<al2.size();k++)
                {
                     //System.out.println("al2: "+al2.get(k));
                     sum2+=al2.get(k);
                }
                //choose max of two
                if(sum1>sum2)
                {
                    grt=sum1;
                }else
                {
                    grt=sum2;
                }
                if(grt<min)
                {
                    min=grt;
                }
                 
            }System.out.println(min);
        } 
    }
}

package prac2;
import java.util.Scanner;
public class payingUp {
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t,i,j,n,m,x,k,sum,a[],count;
        
        t=in.nextInt();
        for(k=0;k<t;k++)
        {
            n=in.nextInt();
            m=in.nextInt();
            a=new int[n];
            
            for(i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }
            x=(int) Math.pow(2,n);
            count=0;
            for(i=0;i<x;i++)
            {
                sum=0;               
                for(j=0;j<n;j++)
                {
                    if((i&(1<<j))>0)
                    {
                        sum+=a[j];
                    }
                    if(sum==m)
                        count++;                   
                }
            } 
            if(count>0)
              System.out.println("Yes"); 
            else
                System.out.println("No");
            
        }
    }
}

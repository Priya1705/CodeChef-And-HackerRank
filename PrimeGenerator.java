package prac2;
import java.util.Scanner;

public class PrimeGenerator 
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int t,j,i,m,n,x,k,count;
        t=in.nextInt();
        for(j=0;j<t;j++)
        {
            m=in.nextInt();
            n=in.nextInt();
            if(m==1)
                m++;
            for(i=m;i<=n;i++)
            {   
                count=0;
                for(k=2;k<=Math.sqrt(i);k++)
                {   
                    if(i%k==0)
                       count++;                    
                }
                if(count==1)
                    System.out.println(i);
            }
            System.out.println();
        }
    }     
}

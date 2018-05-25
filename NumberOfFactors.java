package prac2;
import java.util.Scanner;

public class NumberOfFactors 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t,j,i,n,count,mul;
        t=in.nextInt();
        for(j=0;j<t;j++)
        {   count=0;
            mul=1;
            n=in.nextInt();
            for(i=0;i<n;i++)
            {
                mul*=in.nextInt();
            } 
            for(i=1;i<=(int)Math.sqrt(mul);i++)
            {
                if(mul%i==0 && i*i!=mul)
                {
                    count+=2;
                }
                else if(i*i==mul)
                {
                    count++;  
                }
            }
            System.out.println(count);
        }
    }
}

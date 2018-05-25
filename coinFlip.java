package prac2;
import java.util.Scanner;

public class coinFlip {
    public static void main(String []args)
    {   int t,j,i,n,q,k,g;
        Scanner in=new Scanner(System.in);
        t=in.nextInt(); // no of testcases
        for(j=0;j<t;j++)
        {
            g=in.nextInt(); // no of games played
            for(k=0;k<g;k++)
            {
                i=in.nextInt();
                n=in.nextInt();
                q=in.nextInt();
                
                if(n%2==0)
                {
                    System.out.println(n/2);
                }
                else
                {
                    if(i==q)
                    {
                        System.out.println(n/2);
                    }
                    else
                    {
                        System.out.println((n/2)+1);
                    }
                }
            }
        }
    }
}

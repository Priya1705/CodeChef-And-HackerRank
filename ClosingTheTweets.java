package prac2;
import java.util.Scanner;

public class ClosingTheTweets 
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int n,k,i;
        int a[];
        int b[];
        n=in.nextInt();
        k=in.nextInt();
        a=new int[k];
        b=new int[n];
        for(i=0;i<n;i++)
        {
            b[i]=0;
        }
        
        for(i=0;i<k;i++)
        {
            a[i]=in.nextInt();           
        }
        for(i=0;i<k;i++)
        {
            if(b[a[i]]==0)
                b[a[i]]=1;
            else
                b[a[i]]=0;
        }
        for(i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }
        
        
    }
}

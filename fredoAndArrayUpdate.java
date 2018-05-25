package prac2;
import java.util.Scanner;

public class fredoAndArrayUpdate {
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n,i,a[],sum=0,x;
        n=in.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            sum+=a[i];
        }
        
        x=sum/n;
        System.out.println(x+1);
    }
}

package prac2;
import java.util.Scanner;

public class Tonyfactors {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int q,i,j,n,x,count;
        q=in.nextInt();
        
        for(j=0;j<q;j++)
        {
            n=in.nextInt();
            //x=n/2;
            x= (int) Math.sqrt(n);
            count=0;
            for(i=1;i<=x;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count==4)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }         
    }
}
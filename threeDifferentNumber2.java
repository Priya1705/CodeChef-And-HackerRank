package prac2;
import java.util.Arrays;
import java.util.Scanner;

public class threeDifferentNumber2 {
  
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int t,j,i;
        long ans;
        t=in.nextInt();
        for(j=0;j<t;j++)
        {
            long a[]=new long[3];
            for(i=0;i<3;i++)
            {
                a[i]=in.nextLong();
            }
            Arrays.sort(a);
            long x=1000000007;
            a[0]=a[0]%x;
            a[1]=(a[1]-1)%x;
            a[2]=(a[2]-2)%x;
            
            ans=a[0];
            for(i=1;i<3;i++)
            {
                ans*=a[i];
                ans=ans%x;
            }
            System.out.println(ans);
        }
    }
}

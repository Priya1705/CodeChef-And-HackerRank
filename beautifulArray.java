
package prac2;
import java.util.Scanner;

public class beautifulArray 
{
    public static void main(String[] args)
    {   
        int j,t,i,n,k,m;
        int a[]; 
        Scanner in=new Scanner(System.in);
        //enter no. of test cases
        t=in.nextInt();
        for(m=0;m<t;m++)
        { 
            int count=0;
            //enter no. of elements in array a
            n=in.nextInt();
            a=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }

            for(i=0;i<n;i++)
            {
                for(j=1;j<n;j++)
                {
                    for(k=0;k<n;k++)
                    {
//                        if(a[i]*a[j]==a[k])
//                        {
//                            count++;
//                        }
//                          System.out.println("a[i]=" + a[i] + "a[j]=" + a[j] + "a[k]=" + a[k]);
                          if(a[i]*a[j]==a[k]) 
                            count++;
//                          System.out.println("count is"+count);
                    }
                }
            }
            if(count>0)
            {
                System.out.println("yes");
            }
                else
            {
                System.out.println("no");
            }
        }
    }
}

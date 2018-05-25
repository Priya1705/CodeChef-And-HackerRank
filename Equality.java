/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prac2;
import java.util.Scanner;
/**
 *
 * @author priya_000
 */
public class Equality {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t,n,i,j;
        long sum;
        long a[];
        t=in.nextInt();
        for(i=0;i<t;i++)
        {
            n=in.nextInt();
            a=new long[n];
            sum=0;
            for(j=0;j<n;j++)
            {
                a[j]=in.nextLong();
                sum+=a[j];
            }
            long ans=(long)sum/(n-1);
            for(j=0;j<n;j++)
            {
                System.out.println(ans-a[j]);
            }
        }
    }
}

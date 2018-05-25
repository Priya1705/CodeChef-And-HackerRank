package prac2;
import java.util.Arrays;
import java.util.Scanner;
public class RacingHorses {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t,n,i,j,k,diff;
        t=in.nextInt();       
        for(k=0;k<t;k++)
        {  
           diff=Integer.MAX_VALUE;

           n=in.nextInt();
           int a[]=new int[n];
           for(i=0;i<n;i++)
           {
               a[i]=in.nextInt();
           }
           Arrays.sort(a);
           
           for(i=0;i<n-1;i++)
           {                
               for(j=i+1;j<n;j++)
               {                
                   if((a[j]-a[i])<diff)
                   {
                       diff=a[j]-a[i];
                   }
               }
           }
           System.out.println(diff);
        }
    }
}
